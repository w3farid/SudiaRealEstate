/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.bean;

import com.exam.pojo.Contact;
import com.exam.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Query;
import org.hibernate.Session;

@ManagedBean
@SessionScoped
public class feedback {

    Contact cont = new Contact();
    private List<Contact> list = new ArrayList<Contact>();

    public feedback() {
        feedbackshow();
    }

    public void feedbackshow() {
        list.clear();
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Query q = s.createQuery("from Contact where status = null or status=''");
        list = q.list();
    }

    public String review(int id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Query q=s.createQuery("update Contact set status=:s where id=:id");
        q.setString("s", "Review");
        q.setInteger("id", id);
        q.executeUpdate();
        s.getTransaction().commit();
        s.close();
        FacesContext context=FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Success"));
        return "feedback.xhtml";
    }

    public List<Contact> getList() {
        return list;
    }

    public void setList(List<Contact> list) {
        this.list = list;
    }

}
