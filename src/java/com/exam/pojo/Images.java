package com.exam.pojo;
// Generated Oct 2, 2016 10:27:00 PM by Hibernate Tools 4.3.1



/**
 * Images generated by hbm2java
 */
public class Images  implements java.io.Serializable {


     private int imgId;
     private String buildingImage;
     private String ploatImage;
     private String flatImage;
     private String bedRoomImage;
     private String kitchenImage;
     private String bathRoomImage;
     private String drawingRoomImage;
     private String belconyImage;
     private String parkingImage;

    public Images() {
    }

	
    public Images(int imgId) {
        this.imgId = imgId;
    }
    public Images(int imgId, String buildingImage, String ploatImage, String flatImage, String bedRoomImage, String kitchenImage, String bathRoomImage, String drawingRoomImage, String belconyImage, String parkingImage) {
       this.imgId = imgId;
       this.buildingImage = buildingImage;
       this.ploatImage = ploatImage;
       this.flatImage = flatImage;
       this.bedRoomImage = bedRoomImage;
       this.kitchenImage = kitchenImage;
       this.bathRoomImage = bathRoomImage;
       this.drawingRoomImage = drawingRoomImage;
       this.belconyImage = belconyImage;
       this.parkingImage = parkingImage;
    }
   
    public int getImgId() {
        return this.imgId;
    }
    
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
    public String getBuildingImage() {
        return this.buildingImage;
    }
    
    public void setBuildingImage(String buildingImage) {
        this.buildingImage = buildingImage;
    }
    public String getPloatImage() {
        return this.ploatImage;
    }
    
    public void setPloatImage(String ploatImage) {
        this.ploatImage = ploatImage;
    }
    public String getFlatImage() {
        return this.flatImage;
    }
    
    public void setFlatImage(String flatImage) {
        this.flatImage = flatImage;
    }
    public String getBedRoomImage() {
        return this.bedRoomImage;
    }
    
    public void setBedRoomImage(String bedRoomImage) {
        this.bedRoomImage = bedRoomImage;
    }
    public String getKitchenImage() {
        return this.kitchenImage;
    }
    
    public void setKitchenImage(String kitchenImage) {
        this.kitchenImage = kitchenImage;
    }
    public String getBathRoomImage() {
        return this.bathRoomImage;
    }
    
    public void setBathRoomImage(String bathRoomImage) {
        this.bathRoomImage = bathRoomImage;
    }
    public String getDrawingRoomImage() {
        return this.drawingRoomImage;
    }
    
    public void setDrawingRoomImage(String drawingRoomImage) {
        this.drawingRoomImage = drawingRoomImage;
    }
    public String getBelconyImage() {
        return this.belconyImage;
    }
    
    public void setBelconyImage(String belconyImage) {
        this.belconyImage = belconyImage;
    }
    public String getParkingImage() {
        return this.parkingImage;
    }
    
    public void setParkingImage(String parkingImage) {
        this.parkingImage = parkingImage;
    }




}


