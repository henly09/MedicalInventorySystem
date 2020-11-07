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
public class inventoryequipment {
    
private String name,description,model,suppliername,type,datepurchase;
private int quantity;
private double purchasedprice;   
    
public inventoryequipment(String name,String description,String model,
        String suppliername,String type,String datepurchase,int quantity,double purchaseprice){
    
    this.name = name;
    this.description = description;
    this.model = model;
    this.suppliername = suppliername;
    this.type = type;
    this.datepurchase = datepurchase;
    this.quantity = quantity;
    this.purchasedprice = purchaseprice;

    
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
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
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
    
public String displayequipment(){
        
        String display;
        
        display = "["+"Name: "+getName()+"]"+"["+"Description: "+getDescription()+"]"+"["+"Model/Brand: "+getModel()+"]"+"\n"+
               "["+"Supplier's Name: "+getSuppliername()+"]"+"["+"Type of Equipment: "+getType()+"]"+"["+"Date of Purchase: "+getDatepurchase()+"]"+"\n"+
               "["+"Companies Supplier's Name: "+getSuppliername()+"]"+"["+"Type of Medicine: "+getType()+"]"+
               "["+"Quantity: "+getQuantity()+"]"+"["+"Supplier's Price: "+getPurchasedprice()+"]"+"\n"+"\n";
        
        return display;
        
    }
    
    
}
