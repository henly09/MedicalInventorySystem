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
    
    private String name,description,quality,produced,expiration;
    private int quantity;
    
    public inventorymedicine(String name,String description,String quality,String produced,int quantity,String expiration){
        
        this.name = name;
        this.description = description;
        this.quality = quality;
        this.produced = produced;
        this.quantity = quantity;
        this.expiration = expiration;
        
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
 
    public String displaymedicine(){
        
        String display;
        
        display = "["+"Name: "+name+"]"+"["+" Description: "+description+"]"+"["+" Quality: "+quality+"]"+
               "["+" Date of Production: "+produced+"]"+"["+" Quantity: "+quantity+"]"+"["+" Expiration Date: "+expiration+"]"+"\n";
        
        return display;
        
    }
    
}
