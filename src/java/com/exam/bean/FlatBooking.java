/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.bean;

import com.exam.pojo.Flat2;
import com.exam.pojo.Sales;
import com.exam.util.HibernateUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Query;
import org.hibernate.Session;
import org.primefaces.model.UploadedFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Farid
 */
@ManagedBean(name = "flat")
@SessionScoped
public class FlatBooking {

    private int id;
    private String title;
    private String location;
    private String details;
    private String city;
    private String collection;
    private String size;
    private String bedrooms;
    private String bathrooms;
    private UploadedFile file;
    private String f;
    private String loc="Dhaka";
    
    ApplicationContext ctx = new ClassPathXmlApplicationContext("com/exam/springBean/flatbooking.xml");
    Flat2 flat = ctx.getBean("flatbooking", Flat2.class);
    private List<Flat2> showFlatList = new ArrayList<Flat2>();
    private List<Flat2> showFlatListDetails = new ArrayList<Flat2>();
    

    public Flat2 getFlat() {
        return flat;
    }

    public void setFlat(Flat2 flat) {
        this.flat = flat;
    }

    public FlatBooking() {
        showFlat(); 
    }

    public void upload() throws FileNotFoundException, IOException {

        if (file != null) {
            f = file.getFileName();
            FileInputStream sd = (FileInputStream) file.getInputstream();
            FileOutputStream out = new FileOutputStream("E:\\NetBeansProjects\\Saudia Real Estate\\web\\resources\\images\\flatImages\\" + file.getFileName().toString());
            int c;
            while ((c = sd.read()) != -1) {
                out.write(c);
            }
            sd.close();
            out.close();
        }
    }

    public void changeFlatById() {
        Session s = HibernateUtil.getSessionFactory().openSession();

        s.beginTransaction();
        List<Flat2> fl = new ArrayList<>();
        Query q = s.createQuery("From Flat2 where flatId=" + flat.getFlatId());
        List<Flat2> l = q.list();
        flat = l.get(0);
    }

    public String doInsert() throws IOException {
        upload();
        flat.setTitle(title);
        flat.setLocation(location);
        flat.setDetails(details);
        flat.setCity(city);
        flat.setCollection(collection);
        flat.setSize(size);
        flat.setBedrooms(Integer.parseInt(bedrooms));
        flat.setBathrooms(Integer.parseInt(bathrooms));
        flat.setImage(f);
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(flat);
        s.getTransaction().commit();
        s.close();
        return null;
    }

    public String doupdate() throws IOException {
        upload();
//        flat.setFlatId(id);
//        flat.setTitle(title);
//        flat.setLocation(location);
//        flat.setDetails(details);
//        flat.setCity(city);
//        flat.setCollection(collection);
//        flat.setSize(size);
//        flat.setBedrooms(Integer.parseInt(bedrooms));
//        flat.setBathrooms(Integer.parseInt(bathrooms));
        flat.setImage(f);
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(flat);
        s.getTransaction().commit();
        s.close();
        return null;
    }

    public String doDelete() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(flat);
        s.getTransaction().commit();
        s.close();
        return null;
    }

    public void showFlat() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Query q = s.createQuery("from Flat2");
        List<Flat2> flatSum = q.list();
        for (Flat2 p : flatSum) {
            showFlatList.add(new Flat2(p.getFlatId(), p.getTitle(), p.getLocation(), p.getDetails(), p.getImage()));
        }
    }
    
    
    

    public String FlatDetailsShow(int id) {
        showFlatListDetails.clear();
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Query q = s.createQuery("from Flat2 where flatId=:id");
        q.setParameter("id", id);
        String r = "";
        List<Flat2> flatSum = q.list();
        if (flatSum.size() > 0) {
            for (Flat2 p : flatSum) {
                showFlatListDetails.add(new Flat2(p.getTitle(), p.getLocation(), p.getDetails(), p.getCity(), p.getCollection(), p.getSize(), p.getBedrooms(), p.getBathrooms(), p.getImage()));
                setF(p.getImage());
                setLoc(p.getLocation());
            }
            r = "show.xhtml";
        } else {
            r = null;
        }
        return r;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(String bedrooms) {
        this.bedrooms = bedrooms;
    }

    public String getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(String bathrooms) {
        this.bathrooms = bathrooms;
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public List<Flat2> getShowFlatList() {
        return showFlatList;
    }

    public void setShowFlatList(List<Flat2> showFlatList) {
        this.showFlatList = showFlatList;
    }

    public List<Flat2> getShowFlatListDetails() {
        return showFlatListDetails;
    }

    public void setShowFlatListDetails(List<Flat2> showFlatListDetails) {
        this.showFlatListDetails = showFlatListDetails;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    
}
