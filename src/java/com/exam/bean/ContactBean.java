/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.bean;

import com.exam.pojo.Contact;
import com.exam.pojo.Flat2;
import com.exam.util.HibernateUtil;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Farid
 */
@ManagedBean(name = "c")
@SessionScoped
public class ContactBean {

    private String name;
    private String email;
    private String mobile;
    private String message;
    Contact cont = new Contact();

    public ContactBean() {
    }

    public ContactBean(String name, String email, String mobile, String message) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.message = message;
    }

    public void doContact() {
        cont.setName(name);
        cont.setEmail(email);
        cont.setMobile(mobile);
        cont.setMessage(message);
         FacesMessage message=null;
        Session s = HibernateUtil.getSessionFactory().openSession();
        try {
            s.beginTransaction();
            s.save(cont);
            s.getTransaction().commit();
            s.close();
            message=new FacesMessage(FacesMessage.SEVERITY_INFO,"Success",name);
            FacesContext.getCurrentInstance().addMessage(null,message);           
        } catch (Exception e) {
            System.out.println(e.toString()); 
        }

        
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
