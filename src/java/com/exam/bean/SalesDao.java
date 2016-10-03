/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.bean;

import com.exam.pojo.Flat2;
import com.exam.pojo.Sales;
import com.exam.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import com.exam.bean.SalesModel;

/**
 *
 * @author apcl
 */
public class SalesDao implements SalesModel{

    @Override
    public boolean doInsertSales(Sales sales) {
        try {
            Session s=HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(sales);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean doUpdateSales(Sales sales) {
         try {
            Session s=HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(sales);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean doDeleteSales(Sales sales) {
         try {
            Session s=HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.delete(sales);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Sales> findAllSales() {
         try {
            Session s=HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            List<Sales> salesLi=s.createQuery("From Sales").list();
            s.getTransaction().commit();
            s.close();
            return salesLi;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Sales findSalesById(int salesId) {
         try {
            Session s=HibernateUtil.getSessionFactory().openSession();
            Sales sales=new Sales();
            s.beginTransaction();
            List<Sales> salesLi=s.createQuery("From Sales where salesId="+salesId+"").list();
            sales=salesLi.get(0);
            s.getTransaction().commit();
            s.close();
            return sales;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Integer> allFlatNo() {
        try {
            Session s=HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            List<Integer> fltNo=s.createQuery("Select flatId from Flat2").list();
            s.getTransaction().commit();
            s.close();
            return fltNo;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Flat2> findFlatById(int flatId) {
        try {
            Session s=HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            List<Flat2> fltLi=s.createQuery("Select * from Flat2 where flatId="+flatId+"").list();
            s.getTransaction().commit();
            s.close();
            return fltLi;
        } catch (Exception e) {
            return null;
        }
    }

   
}
