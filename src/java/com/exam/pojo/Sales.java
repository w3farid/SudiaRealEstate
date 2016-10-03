package com.exam.pojo;

public class Sales  implements java.io.Serializable {


     private int salesId;
     private Flat2 flat2;
     private String custName;
     private String custEmail;
     private String custPassword;
     private Double flatPrice;
     private String bankName;
     private String transactionId;
     private Double paidAmount;

    public Sales() {
    }

	
    public Sales(int salesId) {
        this.salesId = salesId;
    }
    public Sales(int salesId, Flat2 flat, String custName, String custEmail, String custPassword, Double flatPrice, String bankName, String transactionId, Double paidAmount) {
       this.salesId = salesId;
       this.flat2 = flat2;
       this.custName = custName;
       this.custEmail = custEmail;
       this.custPassword = custPassword;
       this.flatPrice = flatPrice;
       this.bankName = bankName;
       this.transactionId = transactionId;
       this.paidAmount = paidAmount;
    }
   
    public int getSalesId() {
        return this.salesId;
    }
    
    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }
    public Flat2 getFlat2() {
        return this.flat2;
    }
    
    public void setFlat2(Flat2 flat2) {
        this.flat2 = flat2;
    }
    public String getCustName() {
        return this.custName;
    }
    
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getCustEmail() {
        return this.custEmail;
    }
    
    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }
    public String getCustPassword() {
        return this.custPassword;
    }
    
    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }
    public Double getFlatPrice() {
        return this.flatPrice;
    }
    
    public void setFlatPrice(Double flatPrice) {
        this.flatPrice = flatPrice;
    }
    public String getBankName() {
        return this.bankName;
    }
    
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public Double getPaidAmount() {
        return this.paidAmount;
    }
    
    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }




}


