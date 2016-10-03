package com.exam.pojo;
// Generated Oct 2, 2016 10:27:00 PM by Hibernate Tools 4.3.1



/**
 * Contact generated by hbm2java
 */
public class Contact  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String email;
     private String mobile;
     private String message;
     private String status;

    public Contact() {
    }

    public Contact(String name, String email, String mobile, String message, String status) {
       this.name = name;
       this.email = email;
       this.mobile = mobile;
       this.message = message;
       this.status = status;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }




}


