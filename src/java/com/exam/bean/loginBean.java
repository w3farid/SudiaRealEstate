/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.bean;

import com.exam.pojo.Flat2;
import com.exam.pojo.Login;
import com.exam.pojo.Sales;
import com.exam.util.HibernateUtil;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Query;
import org.hibernate.Session;

@ManagedBean
@SessionScoped
public class loginBean {

    private String avaterimag = "login_avater.png";
    private String email;
    private String pass;

    public loginBean() {
    }

    public String checkLogin() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Query q = s.createQuery("from Login where email=:e and password=:p");
        q.setParameter("e", email);
        q.setParameter("p", pass);
        List<Login> log = q.list();
        String r = "";
        if (log.size() > 0) {
            r = "add_flat.xhtml";
        } else {
            r = "Try again";
        }
        return r;
    }
    

    public void imageCheck() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Query q = s.createQuery("from Login where email=:e");
        q.setParameter("e", email);
        List<Login> log = q.list();
        if (log.size() > 0) {
            setAvaterimag("farid.jpg");
            
        } 
    }

    public String getAvaterimag() {
        return avaterimag;
    }

    public void setAvaterimag(String avaterimag) {
        this.avaterimag = avaterimag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
