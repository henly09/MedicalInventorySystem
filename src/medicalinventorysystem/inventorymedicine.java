/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalinventorysystem;

/**
 *
 * @author Henz Montera
 */
public class inventorymedicine {

   
    
    private String name,description,quality,produced,expiration,suppliername,type,medcompany,datepurchase;
    private int quantity,mrackno;
    private double purchasedprice,saleprice;
    
    public inventorymedicine(String name,String description,String quality,
            String produced,int quantity,String expiration,String suppliername
           ,String type,String medcompany,String datepurchase,double purchasedprice,
           double saleprice,int mrackno){
        
        this.name = name;
        this.description = description;
        this.quality = quality;
        this.produced = produced;
        this.quantity = quantity;
        this.expiration = expiration;
        this.suppliername = suppliername;
        this.type = type;
        this.medcompany = medcompany;
        this.datepurchase = datepurchase;
        this.purchasedprice = purchasedprice;
        this.saleprice = saleprice;
        this.mrackno = mrackno;
        
    }
    
    
     /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the quality
     */
    public String getQuality() {
        return quality;
    }

    /**
     * @param quality the quality to set
     */
    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * @return the produced
     */
    public String getProduced() {
        return produced;
    }

    /**
     * @param produced the produced to set
     */
    public void setProduced(String produced) {
        this.produced = produced;
    }

    /**
     * @return the expiration
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * @param expiration the expiration to set
     */
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    /**
     * @return the suppliername
     */
    public String getSuppliername() {
        return suppliername;
    }

    /**
     * @param suppliername the suppliername to set
     */
    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the medcompany
     */
    public String getMedcompany() {
        return medcompany;
    }

    /**
     * @param medcompany the medcompany to set
     */
    public void setMedcompany(String medcompany) {
        this.medcompany = medcompany;
    }

    /**
     * @return the datepurchase
     */
    public String getDatepurchase() {
        return datepurchase;
    }

    /**
     * @param datepurchase the datepurchase to set
     */
    public void setDatepurchase(String datepurchase) {
        this.datepurchase = datepurchase;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the purchasedprice
     */
    public double getPurchasedprice() {
        return purchasedprice;
    }

    /**
     * @param purchasedprice the purchasedprice to set
     */
    public void setPurchasedprice(double purchasedprice) {
        this.purchasedprice = purchasedprice;
    }

    /**
     * @return the saleprice
     */
    public double getSaleprice() {
        return saleprice;
    }

    /**
     * @param saleprice the saleprice to set
     */
    public void setSaleprice(double saleprice) {
        this.saleprice = saleprice;
    }

    /**
     * @return the mrackno
     */
    public int getMrackno() {
        return mrackno;
    }

    /**
     * @param mrackno the mrackno to set
     */
    public void setMrackno(int mrackno) {
        this.mrackno = mrackno;
    }

       
    public String displaymedicine(){
        
        String display;
        
        display = "["+"Name: "+getName()+"]"+"["+"Description: "+getDescription()+"]"+"["+"Quality: "+getQuality()+"]"+"\n"+
               "["+"Date of Production: "+getProduced()+"]"+"["+"Quantity: "+getQuantity()+"]"+"["+"Expiration Date: "+getExpiration()+"]"+"\n"+
               "["+"Companies Supplier's Name: "+getSuppliername()+"]"+"["+"Type of Medicine: "+getType()+"]"+"["+"Medicine's Company Name: "+getMedcompany()+"]"+"\n"+
               "["+"Date of Purchase: "+getDatepurchase()+"]"+"["+"Supplier's Price: "+getPurchasedprice()+"]"+"["+"Sale Price of Medicine : "+getSaleprice()+"]"+"\n"+
               "["+"Medicine's Rack No. : "+getMrackno()+"]"+"\n"+"\n";
        
        return display;
        
    }
    
}
