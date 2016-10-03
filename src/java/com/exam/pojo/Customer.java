package com.exam.pojo;
// Generated Oct 2, 2016 10:27:00 PM by Hibernate Tools 4.3.1



/**
 * Customer generated by hbm2java
 */
public class Customer  implements java.io.Serializable {


     private Integer custId;
     private String custName;
     private String fatherName;
     private String address;
     private String email;
     private String nationalId;
     private String contact;

    public Customer() {
    }

    public Customer(String custName, String fatherName, String address, String email, String nationalId, String contact) {
       this.custName = custName;
       this.fatherName = fatherName;
       this.address = address;
       this.email = email;
       this.nationalId = nationalId;
       this.contact = contact;
    }
   
    public Integer getCustId() {
        return this.custId;
    }
    
    public void setCustId(Integer custId) {
        this.custId = custId;
    }
    public String getCustName() {
        return this.custName;
    }
    
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getFatherName() {
        return this.fatherName;
    }
    
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNationalId() {
        return this.nationalId;
    }
    
    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
    public String getContact() {
        return this.contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }




}


