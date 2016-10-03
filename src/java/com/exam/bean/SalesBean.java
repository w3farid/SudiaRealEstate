/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.bean;

import com.exam.pojo.Flat;
import com.exam.pojo.Flat2;
import com.exam.pojo.Sales;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import com.exam.bean.SalesDao;
import com.exam.util.HibernateUtil;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.SessionScoped;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author apcl
 */
@Component
@ManagedBean(name = "s")
@SessionScoped
public class SalesBean {

    ApplicationContext ctx = new ClassPathXmlApplicationContext("com/exam/springBean/SalesConfig.xml");
    private Sales sales = (Sales) ctx.getBean("salesBean");
    private Flat2 flat = (Flat2) ctx.getBean("flatBean");
    private SalesDao salDao = (SalesDao) ctx.getBean("salesDao");
    private List<Sales> salesLi = new ArrayList<Sales>();
    private List<Sales> salesLiById = new ArrayList<Sales>();
    private List<Flat2> flatLiById = new ArrayList<Flat2>();
    private List<Integer> allFlatNo = new ArrayList<Integer>();
    private List<Sales> showFlatDetailsCust = new ArrayList<Sales>();
    

    public SalesBean() {
        showCust();
        allSales();
        
    }

    @Autowired
    public String checkLoginCustomer() {

        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Query q = s.createQuery("from Sales where custEmail=:e and custPassword=:p");
        q.setParameter("e", sales.getCustEmail());
        q.setParameter("p", sales.getCustPassword());
        List<Sales> log = q.list();
        String r = "";
        if (log.size() > 0) {
            r = "customer.xhtml";
        } else {
            r = "Try again";
        }
        return r;
    }

    @Autowired
    public void showCust() {
        showFlatDetailsCust.clear();
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Query q = s.createQuery("from Sales where custEmail=:email");
        q.setParameter("email", "a@gmail.com");
        List<Sales> flatSum = q.list();
        if (flatSum.size() > 0) {
            for (Sales p : flatSum) {
                showFlatDetailsCust.add(new Sales(p.getSalesId(), p.getFlat2(), p.getCustName(), p.getCustEmail(), p.getCustPassword(), p.getFlatPrice(), p.getBankName(), p.getTransactionId(), p.getPaidAmount()));
            }
        }
    }

    @Autowired
    public void doInsert() {
        sales.setFlat2(flat);
        boolean b = salDao.doInsertSales(sales);
        if (b) {
            addMsg("Success!!");
        } else {
            this.addMsg("Error occured!!");
        }
    }

    @Autowired
    public void updateSales() {
        sales.setFlat2(flat);
        boolean b = salDao.doUpdateSales(sales);
        if (b) {
            addMsg("Success!!");
        } else {
            this.addMsg("Error occured!!");
        }
    }

    @Autowired
    public void deleteSales() {
        sales.setFlat2(flat);
        boolean b = salDao.doDeleteSales(sales);
        if (b) {
            addMsg("Success!!");
        } else {
            this.addMsg("Error occured!!");
        }
    }

    @Autowired
    public void allSales() {
        salesLi = salDao.findAllSales();
    }

    @Autowired
    public void allSalesById() {
        sales = salDao.findSalesById(sales.getSalesId());
        this.sales = sales;
        this.flat = sales.getFlat2();
    }

    @Autowired
    public void allFlatById() {
        flatLiById = salDao.findFlatById(flat.getFlatId());
    }

    @Autowired
    public void allFlatNoLi() {
        allFlatNo = salDao.allFlatNo();
    }

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    public SalesDao getSalDao() {
        return salDao;
    }

    public void setSalDao(SalesDao salDao) {
        this.salDao = salDao;
    }

    public List<Sales> getSalesLi() {
        return salesLi;
    }

    public void setSalesLi(List<Sales> salesLi) {
        this.salesLi = salesLi;
    }

    public List<Sales> getSalesLiById() {
        return salesLiById;
    }

    public void setSalesLiById(List<Sales> salesLiById) {
        this.salesLiById = salesLiById;
    }

    public void addMsg(String msgR) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, msgR, null);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public List<Flat2> getFlatLiById() {
        return flatLiById;
    }

    public void setFlatLiById(List<Flat2> flatLiById) {
        this.flatLiById = flatLiById;
    }

    public List<Integer> getAllFlatNo() {
        return allFlatNo;
    }

    public void setAllFlatNo(List<Integer> allFlatNo) {
        this.allFlatNo = allFlatNo;
    }

    public Flat2 getFlat() {
        return flat;
    }

    public void setFlat(Flat2 flat) {
        this.flat = flat;
    }

    public List<Sales> getShowFlatDetailsCust() {
        return showFlatDetailsCust;
    }

    public void setShowFlatDetailsCust(List<Sales> showFlatDetailsCust) {
        this.showFlatDetailsCust = showFlatDetailsCust;
    }

   
}
