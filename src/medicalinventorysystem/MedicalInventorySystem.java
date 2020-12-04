/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*

School : Holy Cross of Davao College BSIT Department

    CC104 Project for Finals
  
        John Henly Montera, BSIT 2nd Year 
        John Alvin Bula, BSIT 2nd Year 
        Ricardo Jose Linao, BSIT 2nd Year 

    CC104 MTWThF 1:00 - 2:00 PM

NOTES:

    rotateA() = Head to Tail 
    RotateB() = Tail to Head

    Structure = Doubly Cirular Linked List

    com1 = Hospital Equipments Inventory
    com2 = medicine inventory

    DList1 = dlistcll<>() = For medicine inventory
    DList2 = dlistcll2<>() = For equipments inventory

*/
package medicalinventorysystem;

import java.util.Scanner;
/**
 *
 * @author Henz Montera
 */
public class MedicalInventorySystem {
       
    static dlistcll<inventorymedicine> com2 = new dlistcll<>();
    static dlistcll2<inventoryequipment> com1 = new dlistcll2<>();
     
    
    static Scanner scan = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
       start();  
    }   
        
    public static void start(){
        
        System.out.print("Welcome to Medical Center Inventory Management System\n"+"\n");
        System.out.print("Press any key to continue . . . \n");
        scan.nextLine();
        System.out.print("\n\n\n\n\n");
        System.out.print("\n\n\n\n\n");

        boolean paw = true;
        
        do {            
        try {            
        while (paw == true) {   
        
        System.out.print("Choices: \n\n");
        System.out.print("Medicines Inventory [1] \n");
        System.out.print("Hospital Equipments Inventory [2] \n");
        System.out.print("Display Medicine Inventory [3] \n");
        System.out.print("Display Hospital Equipment Inventory [4] \n");
        System.out.print("Exit: [5] \n");
   
        int choice = Integer.parseInt(scan.nextLine());
        System.out.print("\n\n\n\n\n");
        System.out.print("\n\n\n\n\n");
        
        switch (choice) {
            
            case 1:
                medicinechoice();
                paw = false;
                break;
            case 2:
                equipmentchoice();
                paw = false;
                break;
            case 3:
                displaymedicines();
                paw = false;
                break;
            case 4:
                displayequipments();
                paw = false;
                break;    
            case 5:
                System.out.print("Goodbye!");
                System.out.print("\n\n\n\n\n");
                System.out.print("Press any key to continue . . . \n");
                scan.nextLine();
                System.exit(0);
                paw = false;
                break;    
            default: 
                System.out.print("Your input is Invalid! \n");
                System.out.print("\n\n\n\n\n");
                paw = true;
                break;                
        }       
      }
        
         break;
        
        } catch (NumberFormatException x) { 
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
         }      
        
        } while (true);
    }
    
//------------------------------------------------------------ Source Code in Medicine Inventory
    
    public static void medicinechoice(){
        
        boolean law = true;
        
        do{
        try{
        while (law){
            
            System.out.print("Insert Medicine into Inventory: [1] \n");
            System.out.print("Remove Medicine from Inventory: [2] \n");
            System.out.print("Edit the Information of a Medicine from Inventory: [3] \n");
            System.out.print("Back?: [4] \n");
            
            int aw = Integer.parseInt(scan.nextLine());
            
            System.out.print("\n\n\n\n\n");
            
            switch (aw) {
                case 1: 
                    insertMedicine();
                    law = false;
                    break;
                case 2:
                    if (com2.isEmpty()){
                        System.out.print("There is nothing to be remove in the invetory of medicine.\n\n\n\n\n");
                        System.out.print("Press any key to continue.....");
                        scan.nextLine();
                        start();}
                    removemedicine();
                    law = false;
                    break;  
                case 3:
                     if (com2.isEmpty()){
                        System.out.print("There is nothing to be edit in the invetory of medicine.\n\n\n\n\n");
                        System.out.print("Press any key to continue.....");
                        scan.nextLine();
                        start();}
                    setnewmedicine();
                    law = false;
                    break;  
                case 4:
                    start();
                    law = false;
                    break;
                default:
                    System.out.print("Invalid Choice\n\n");
                    law = true;
                    break;
            }
            
            }
        break;
        } catch (NumberFormatException x){
            System.out.print("Your input is invalid.");
            System.out.print("\n\n\n\n\n");
        }
      } while(true);
    }
    
    public static void insertMedicine(){
        
         System.out.print("Insertion of Items into the Medicine's Inventory.\n"+"\n");
         System.out.print("Press any key to continue . . . \n");
         scan.nextLine();
         System.out.print("\n\n\n\n\n");
        
         String a,b,c,d,f,g,h,i,j; 
         int e,m;
         double k,l;
         
         System.out.print("Name of the Medicine: ");
         a = scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("Description of the "+a+" Medicine: ");
         b = scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("Quality of the Medicine "+a+": ");
         c = scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("Date of the Production of the "+a+": mm/dd/yy:");
         d = scan.nextLine();
         System.out.print("\n\n\n\n\n");
         
//---------------------------------------------------------------------  
    
         do{   
         System.out.print("Quantity: "); 
         try {          
             e = Integer.parseInt(scan.nextLine()); 
             break;     
         } catch (NumberFormatException x) { 
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
         }     
         }while (true);
         
//---------------------------------------------------------------------  
        
         System.out.print("\n\n\n\n\n"); 
         System.out.print("Date of Expiration: mm/dd/yy:");
         f = scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("Supplier's Name: ");
         g = scan.nextLine();
         System.out.print("\n\n\n\n\n");
         
         int q = 0;
          
         do{
         q++;
            if (q > 1){
                System.out.print("Your input is invalid! \n\n\n\n\n\n");
            }
         System.out.print("Type of Medicine (Syrup/Tablet/Injetion): ");
         h = scan.nextLine();
         } while ((!h.equals("Syrup")) && (!h.equals("Tablet")) && (!h.equals("Injection")));
         
         System.out.print("\n\n\n\n\n");
         System.out.print("Name of the Medicine's Company: ");
         i = scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("Date of Purchased: mm/dd/yy:");
         j = scan.nextLine();
         System.out.print("\n\n\n\n\n"); 

//---------------------------------------------------------------------          
         
         do{   
         System.out.print("Price of the Purchased "+a+" : "); 
         try {          
             k = Double.parseDouble(scan.nextLine());
             break;     
         } catch (NumberFormatException x) { 
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
         }     
         }while (true);
         
//--------------------------------------------------------------------- 

         System.out.print("\n\n\n\n\n"); 
         do{   
         System.out.print("Sale Price of the "+a+" : "); 
         try {          
             l = Double.parseDouble(scan.nextLine());
             break;     
         } catch (NumberFormatException x) { 
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
         }     
         }while (true);
         
//---------------------------------------------------------------------   
         
         System.out.print("\n\n\n\n\n"); 
         do{   
         System.out.print("Medicine's rack No# : "); 
         try {          
             m = Integer.parseInt(scan.nextLine());
             break;     
         } catch (NumberFormatException x) { 
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
         }     
         }while (true);
         System.out.print("\n\n\n\n\n");       
         
//        com2.addlast(new inventorymedicine("Paracetamol","For fever and headache","Generic","11/31/12",41,"12/31/20","DDC","Tablet","St.Lukes Hospital","11/41/08",5.00,12.41,41));
//        com2.addlast(new inventorymedicine("Neozep","For fever and headache","Generic","11/31/12",41,"12/31/20","DDC","Tablet","St.Lukes Hospital","11/41/08",5.00,12.41,41));
//        com2.addlast(new inventorymedicine("Ambroxol","For fever and headache","Generic","11/31/12",41,"12/31/20","DDC","Tablet","St.Lukes Hospital","11/41/08",5.00,12.41,41));
//        com2.addlast(new inventorymedicine("Cetirizine","For fever and headache","Generic","11/31/12",41,"12/31/20","DDC","Tablet","St.Lukes Hospital","11/41/08",5.00,12.41,41));
//        com2.addlast(new inventorymedicine("Loperamide","For fever and headache","Generic","11/31/12",41,"12/31/20","DDC","Tablet","St.Lukes Hospital","11/41/08",5.00,12.41,41));
                       

        com2.addfirst(new inventorymedicine(a,b,c,d,e,f,g,h,i,j,k,l,m));
       
        int qe = 0;

        for(int ie=com2.size();ie!=0;ie--){
            qe++;
            if (ie == com2.size()){
                System.out.print("-----------------------------------------------------------------------------------------------------------------------\n");
            }
            System.out.print("No."+qe+":"+"\n\n"+com2.head().displaymedicine());
            com2.rotateA();
            if (ie == 1){
                System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
            }
        }
        
        System.out.print("Press any key to continue . . . \n");
        scan.nextLine();
        System.out.print("\n\n\n\n\n");
       
        boolean waw = true;  
        
        do{
           try{
        while (waw){
        
        System.out.print("Do you want to add more medicine? Yes[Y] || No[N] ");
        String choice = scan.nextLine();
        System.out.print("\n\n\n\n\n");
  
            switch (choice) {
            case "Y":
            case "y":
                insertMedicine();
                waw = false;
                break;
            case "N":
            case "n":
            int q1 = 0;
        for(int iw=com2.size();iw!=0;iw--){
            q1++;
            if (iw == com2.size()){
                System.out.print("-----------------------------------------------------------------------------------------------------------------------\n");
            }
            System.out.print("No."+q1+": \n\n"+com2.head().displaymedicine());
            com2.rotateA();
            if (iw == 1){
                System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
            }
        }
                scan.nextLine();
                start();
                waw = false;
                break;
                default:
                System.out.print("Your input is Invalid! \n");
                System.out.print("\n\n\n\n\n");
                System.out.print("\n\n\n\n\n");
                waw = true;
                break;
                
            }
        }  
        break;
           } catch(NumberFormatException x){
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
           }
        } while(true);
        
        
    }   
    
    public static void removemedicine(){
        
         System.out.print("Removing of Items into Medicine's Inventory.\n"+"\n");
         System.out.print("NOTE: you can only remove the one who called HEAD.\n"+"\n");
         System.out.print("Press any key to continue . . . \n");
         scan.nextLine();
         System.out.print("\n\n\n\n\n");
          
         boolean awa = true;
         
         do {
         try{
         while (awa){
             
             System.out.print("Do you want to remove this? Yes[Y] or No[N] or Go back to the Menu [G] \n"+"Current Head:\n"+com2.head().displaymedicine());
                String choice = scan.nextLine();
                System.out.print("\n\n\n\n\n");
             
             switch (choice) {
                 case "Y":
                 case "y":
                     com2.removefirst();
                     System.out.print("Do you want to remove more? Yes[Y] or No[N] \n ");
                     String c = scan.nextLine();
                     System.out.print("\n\n\n\n\n");
                     switch (c) {
                         case "Y":
                         case "y":
                             if (com2.isEmpty()){
                                 System.out.print("There is nothing to be remove in the invetory of medicine.\n");
                                 start(); }
                             awa = true;
                             break;
                         case "N":
                         case "n":
                             awa = false;
                             int q1 = 0;
                             System.out.print("Current Inventory: \n\n");
                             for(int i=com2.size();i!=0;i--){
                                 q1++;
                                 if (i == com2.size()){
                                     System.out.print("-----------------------------------------------------------------------------------------------------------------------\n");
                                 }
                                 System.out.print("No."+q1+":"+com2.head().displaymedicine());
                                 com2.rotateA();
                                 if (i == 1){
                                     System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
                                 }
                             }
                             start();
                             break;
                         default:
                             System.out.print("Error: Invalid input! \n");
                             awa = true;}
                 case "N":
                 case "n":
                     System.out.print("Next [1] & Prev [2] or Go Back [3]");
                     boolean maw = true;
                     while (maw){
                     String ch = scan.nextLine();
                                      
                         switch (ch) {
                             case "1":
                                 com2.rotateA();
                                 System.out.print("\n\n\n\n\n");
                                 maw = false;
                                 break;
                             case "2":
                                 com2.rotateB();
                                 System.out.print("\n\n\n\n\n");
                                 maw = false;
                                 break;
                             case "3":
                                 removemedicine();
                                 System.out.print("\n\n\n\n\n");
                                 maw = false;
                                 break;
                             default:
                                 System.out.print("Your input is invalid \n");
                                 maw = true;
                                 break;
                         }
                     }
                     break;
                 case "G":
                 case "g":
                     start();
                     awa = false;
                     break;
                 default:
                     System.out.print("Your input is invalid \n");
                     awa = true;
                     break;
             }
    }  
         break;
         }catch (NumberFormatException x){
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
         }
         } while(true);
    
}
    
    public static void displaymedicines(){
        
        if (com2.isEmpty()){
            System.out.print("There is nothing to be displayed! The Inventory in this area is empty!\n\n\n\n\n");
            start();
        }
        System.out.print("\n\n\n\n\n");
        System.out.print("\n\n\n\n\n");
        System.out.print("Medicine's Inventory\n");
        
        int q = 0;

        for(int i=com2.size();i!=0;i--){
            q++;
            if (i == com2.size()){
                System.out.print("-----------------------------------------------------------------------------------------------------------------------\n");
            }
            System.out.print("No."+q+":"+com2.head().displaymedicine());
            com2.rotateA();
            if (i == 1){
                System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
            }
        }
        
         System.out.print("Press any key to continue . . . \n");
         scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("\n\n\n\n\n");
         
         start();
        
        
    } 
    
    public static void setnewmedicine(){
        
         System.out.print("Editing of Items from the Medicine's Inventory inventory.\n"+"\n");
         System.out.print("NOTE: you can only edit the one who called HEAD.\n"+"\n");
         System.out.print("Press any key to continue . . . \n");
         scan.nextLine();
         System.out.print("\n\n\n\n\n");
          
         boolean awa = true;
         
         do {
             
         try{
             
         while (awa){
             
             System.out.print("\n\n Do you want to edit this? Yes[Y] or No[N] or Go back to the Menu [G] \n"+"\n\nCurrent Head: \n\n"+com2.head().displaymedicine());
                String choice = scan.nextLine();
                System.out.print("\n\n\n\n\n");
             
             switch (choice) {
                 case "Y":
                 case "y":
                     settermed();
                     break;
                 case "N":
                 case "n":
                     System.out.print("Next [1] & Prev [2] or Go Back [3]");
                     
                     boolean maw = true;
                      
                     while (maw){
                     String ch = scan.nextLine();
                                      
                         switch (ch) {
                             case "1":
                                 com2.rotateA();
                                 System.out.print("\n\n\n\n\n");
                                 maw = false;
                                 break;
                             case "2":
                                 com2.rotateB();
                                 System.out.print("\n\n\n\n\n");
                                 maw = false;
                                 break;
                             case "3":
                                 setnewmedicine();
                                 System.out.print("\n\n\n\n\n");
                                 maw = false;
                                 break;
                             default:
                                 System.out.print("Your input is invalid \n");
                                 maw = true;
                                 break;
                         }
                     }
                     break;
                 case "G":
                 case "g":
                     start();
                     awa = false;
                     break;
                 default:
                     System.out.print("Your input is invalid \n");
                     awa = true;
                     break;
             }
    }  
         break;
         }catch (NumberFormatException x){
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
         }
         } while(true);
        
    }
    
    public static void choicemed(){
        
         System.out.print("\n Do you want to edit more? [Y] or [N] \n");
             String j = scan.nextLine();             
             switch (j) {   
                 case "Y":
                 case "y":
                     settermed();
                     break;
                 case "N":
                 case "n":
                     System.out.print("\n\n\n\n\n");
                     System.out.print("Edited Data: \n\n");
                     System.out.print(com2.head().displaymedicine()+"\n");
                     System.out.print("Press any key to continue");
                     scan.nextLine();
                     start();
                     break;
                 default:
                     System.out.print("Your input is invalid!\n\n");
                     System.out.print("Press any key to continue");
                     scan.nextLine();
                     choicemed();
                     break;                    
             }    
    }
        
    public static void settermed(){
        
         System.out.print("What information you want edit? \n\n");
         
         System.out.print(    "Name [1]\n"
                            + "Description [2]\n"
                            + "Quality [3]\n"
                            + "Date of Production [4]\n"
                            + "Quantity [5]\n"
                            + "Date of Expiration [6]\n"
                            + "Supplier's Name [7]\n"
                            + "Type of Medicine (Syrup/Tablet/Injection [8])\n"
                            + "Name of the Medicine's Company [9]\n"
                            + "Date of Purchased [10]\n"
                            + "Price of the Purchased Medicine [11]\n"
                            + "Price of the For Sale Medicine [12]\n"
                            + "Medicine's Rack No# [13]\n");
                  
         String choice = scan.nextLine();
         
         switch (choice){
             
             case "1":
             System.out.print("\n\n\n\n\n");
             System.out.print("Current Name: "+com2.head().getName()+"\n");
             System.out.print("New Name: ");
             String a = scan.nextLine();
             com2.head().setName(a);
             choicemed();
             break;
              
             case "2":
             System.out.print("\n\n\n\n\n");  
             System.out.print("Current Description: "+com2.head().getDescription()+"\n");
             System.out.print("New Description: ");
             String b = scan.nextLine();
             com2.head().setDescription(b);
             choicemed();
             break;
               
             case "3":   
             System.out.print("\n\n\n\n\n");
             System.out.print("Current Quality: "+com2.head().getQuality()+"\n");
             System.out.print("New Quality: ");
             String c = scan.nextLine();
             com2.head().setQuality(c);
             choicemed();
             break;
                  
             case "4":
             System.out.print("\n\n\n\n\n");
             System.out.print("Current Date of Production: "+com2.head().getProduced()+"\n");
             System.out.print("New Date of Production (mm/dd/yy): ");
             String d = scan.nextLine();
             com2.head().setProduced(d);
             choicemed();
             break;
             
             case "5":
             int e;
             do{
                System.out.print("\n\n\n\n\n");    
                System.out.print("Current Quantity: "+com2.head().getQuantity()+"\n");
                System.out.print("New Quantity: "); 
             try {          
                e = Integer.parseInt(scan.nextLine()); 
             break;     
             } catch (NumberFormatException x) { 
                System.out.print("Your input is invalid.");
                System.out.print("\n\n\n\n\n");
             } }while (true);
                com2.head().setQuantity(e);
                choicemed();
             break;
            
             case "6":
             System.out.print("\n\n\n\n\n");
             System.out.print("Current Date of Expiration: "+com2.head().getExpiration()+"\n");
             System.out.print("New Date of Expiration (mm/dd/yy): ");
             String f = scan.nextLine();
             com2.head().setExpiration(f);
             choicemed();
             break;  
             
             case "7":
             System.out.print("\n\n\n\n\n");
             System.out.print("Current Name of the Medicine's Supplier: "+com2.head().getSuppliername()+"\n");
             System.out.print("New Name for the Medicine's Supplier: ");
             String g = scan.nextLine();
             com2.head().setSuppliername(g);
             choicemed();
             break;   
             
             case "8":
             int q = 0;
             String h;
             do{
             q++;
                if (q > 1){
                System.out.print("Your input is invalid! \n\n\n\n\n\n"); }
                System.out.print("Current Type: "+com2.head().getType()+"\n");
                System.out.print("New Type of Medicine (Syrup/Tablet/Injetion): ");
                h = scan.nextLine();
             } while ((!h.equals("Syrup")) && (!h.equals("Tablet")) && (!h.equals("Injection")));        
             com2.head().setType(h);            
             choicemed();
             break;
             
             case "9":
             System.out.print("\n\n\n\n\n");
             System.out.print("Current Name of the Medicine's Company: "+com2.head().getMedcompany()+"\n");
             System.out.print("New Name of the Medicine's Company: ");
             String i = scan.nextLine();
             com2.head().setMedcompany(i);
             choicemed();
             break;
             
             case "10":
             System.out.print("\n\n\n\n\n");
             System.out.print("Current Date of Purchase: "+com2.head().getDatepurchase()+"\n");
             System.out.print("New Date of Purchase (mm/dd/yy): ");
             String j = scan.nextLine();
             com2.head().setDatepurchase(j);
             choicemed();
             break;    
                 
             case "11":
             Double k;
             do{
                System.out.print("\n\n\n\n\n");
                System.out.print("Current Price when purchased: "+com2.head().getPurchasedprice()+"\n");
                System.out.print("New Price when purchased: "); 
             try {          
              k = Double.parseDouble(scan.nextLine()); 
             break;     
             } catch (NumberFormatException x) { 
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
             }}while (true);
             com2.head().setPurchasedprice(k);
             choicemed();
             break;
             
             case "12":
             Double l;
             do{
             System.out.print("\n\n\n\n\n");
             System.out.print("Current Price when sale: "+com2.head().getSaleprice()+"\n");
             System.out.print("New Price when sale: ");
             try { 
                 l = Double.parseDouble(scan.nextLine());
                 break;
              } catch (NumberFormatException x) { 
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
                }
             }while (true);  
             com2.head().setSaleprice(l);
             choicemed();
             break;    
                 
             case "13":
             int m;
             do {
                 System.out.print("\n\n\n\n\n");
                 System.out.print("Current Rack Number: "+com2.head().getMrackno()+"\n");
                 System.out.print("New Rack Number: ");
                 try {
                     m = Integer.parseInt(scan.nextLine());
                     break;
                 } catch (NumberFormatException x) { 
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
             }}while (true);   
             com2.head().setMrackno(m);
             choicemed();
             break; 
             
             default:
                 System.out.print("\n\n\n\n\n");
                 System.out.print("Your input is invalid! \n\n");
                 System.out.print("Press any key to continue ....");
                 scan.nextLine();
                 settermed();
                 
         }
    }
    
//------------------------------------------------------------- Source Code in Hospital Equipment Inventory   
      
    public static void equipmentchoice(){
        
        boolean law = true;
        
        do {
        try{
        while (law){
            
            System.out.print("Insert Equipment into Inventory: [1] \n");
            System.out.print("Remove Equipment from Inventory: [2] \n");
            System.out.print("Edit Equipment's Information from Inventory: [3] \n");
            System.out.print("Back?: [4] \n");
            
            int aw = Integer.parseInt(scan.nextLine());
            System.out.print("\n\n\n\n\n");
            
            switch (aw) {
                case 1: 
                    insertequip();
                    law = false;
                    break;
                case 2:
                    if (com1.isEmpty()){
                        System.out.print("There is nothing to be remove in the invetory of Hospital Equipments.\n");
                        start();}
                    removeequip();
                    law = false;
                    break;
                case 3:
                    if (com1.isEmpty()){
                        System.out.print("There is nothing to be edit in the invetory of Equipments.\n\n\n\n\n");
                        System.out.print("Press any key to continue.....");
                        scan.nextLine();
                        start();}
                    law = false;
                    setnewequipment();
                    break;
                case 4:
                    start();
                    law = false;
                    break;
                default:
                    System.out.print("Invalid Choice\n\n");
                    law = true;
                    break;
            }
        }
         break;
        } catch (NumberFormatException x){
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
        }
        } while (true);
    }
    
    public static void insertequip(){
        
         System.out.print("Insertion of Items into inventory.\n"+"\n");
         System.out.print("Press any key to continue . . . \n");
         scan.nextLine();
         System.out.print("\n\n\n\n\n");
         
         String a,b,c,d,e,f; 
         int g;
         double h;
         
         System.out.print("Name of the Equipment: ");
         a = scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("Description: ");
         b = scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("Model or Brand of the Equipment: ");
         c = scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("Name of the Supplier's Company:");
         d = scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("Type of Equipment: ");
         e = scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("Date of Purchase:  mm/dd/yy:");
         f = scan.nextLine();
         System.out.print("\n\n\n\n\n");
           
//------------------------------------------------------------
         
         do{   
         System.out.print("Quantity: "); 
         try {          
             g = Integer.parseInt(scan.nextLine()); 
             break;     
         } catch (NumberFormatException x) { 
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
         }     
         }while (true);
         System.out.print("\n\n\n\n\n"); 
//------------------------------------------------------------

         do{   
         System.out.print("Price of the Purchased equipment :"+a+" : "); 
         try {          
             h = Double.parseDouble(scan.nextLine());
             break;     
         } catch (NumberFormatException x) { 
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
         }     
         }while (true);
         System.out.print("\n\n\n\n\n");  

//------------------------------------------------------------

//com1.addlast(new inventoryequipment("Stethoscope","To hear heart beat and others","Littmann 6152 Cardiology IV Stethoscope","Littmann","Testing Equipment","12/31/41",41,300000.00));
//com1.addlast(new inventoryequipment("Weight Checker","To hear heart beat and others","Littmann 6152 Cardiology IV Stethoscope","Littmann","Testing Equipment","12/31/41",41,300000.00));
//com1.addlast(new inventoryequipment("Dental Chair","To hear heart beat and others","Littmann 6152 Cardiology IV Stethoscope","Littmann","Testing Equipment","12/31/41",41,300000.00));
//com1.addlast(new inventoryequipment("Surgery Knife","To hear heart beat and others","Littmann 6152 Cardiology IV Stethoscope","Littmann","Testing Equipment","12/31/41",41,300000.00));
//com1.addlast(new inventoryequipment("Surgery Needles","To hear heart beat and others","Littmann 6152 Cardiology IV Stethoscope","Littmann","Testing Equipment","12/31/41",41,300000.00));
         
         com1.addlast(new inventoryequipment(a,b,c,d,e,f,g,h));
         
        int qe = 0;

        for(int ie=com1.size();ie!=0;ie--){
            qe++;
            if (ie == com1.size()){
                System.out.print("-----------------------------------------------------------------------------------------------------------------------\n");
            }
            System.out.print("No."+qe+":"+"\n"+com1.head().displayequipment());
            com1.rotateA();
            if (ie == 1){
                System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
            }
        }
        
        System.out.print("Press any key to continue . . . \n");
        scan.nextLine();
        System.out.print("\n\n\n\n\n");
       
        boolean waw = true; 
        
        do{
            try{
        while (waw){
        
        System.out.print("Do you want to add more equipments? Yes[Y] || No[N] ");
        String choice = scan.nextLine();
        System.out.print("\n\n\n\n\n");
 
            switch (choice) {
            case "Y":
            case "y":
                insertequip();
                waw = false;
                break;
            case "N":
            case "n":
            int q1 = 0;
        for(int iw=com1.size();iw!=0;iw--){
            q1++;
            if (iw == com1.size()){
                System.out.print("-----------------------------------------------------------------------------------------------------------------------\n");
            }
            System.out.print("No."+q1+":"+com1.head().displayequipment());
            com1.rotateA();
            if (iw == 1){
                System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
            }
        }
                scan.nextLine();
                start();
                waw = false;
                break;
                default:
                System.out.print("Your input is Invalid! \n");
                System.out.print("\n\n\n\n\n");
                System.out.print("\n\n\n\n\n");
                waw = true;
                break;
                
            }
        }
        break;
            } catch (NumberFormatException x){
                System.out.print("Your input is invalid.");
                System.out.print("\n\n\n\n\n");
            }
        } while(true);
        
    }
    
    public static void removeequip(){
        
         System.out.print("Removing of Items into inventory.\n"+"\n");
         System.out.print("NOTE: you can only remove the one who called HEAD.\n"+"\n");
         System.out.print("Press any key to continue . . . \n");
         scan.nextLine();
         System.out.print("\n\n\n\n\n");
          
         boolean awa = true;
         
         do {
             try{
         while (awa){
             
             System.out.print("Do you want to remove this? Yes[Y] or No[N] or Go back to the Menu [G] \n"+"Current Head:\n"+com1.head().displayequipment());
                String choice = scan.nextLine();
                System.out.print("\n\n\n\n\n");
             
             switch (choice) {
                 case "Y":
                 case "y":
                     com1.removefirst();
                     System.out.print("Do you want to remove more? Yes[Y] or No[N] \n ");
                     String c = scan.nextLine();
                     System.out.print("\n\n\n\n\n");
                     switch (c) {
                         case "Y":
                         case "y":
                             if (com1.isEmpty()){
                                 System.out.print("There is nothing to be remove in the invetory of Equipments.\n");
                                 start(); }
                             awa = true;
                             break;
                         case "N":
                         case "n":
                             awa = false;
                             int q1 = 0;
                             for(int i=com1.size();i!=0;i--){
                                 q1++;
                                 if (i == com1.size()){
                                     System.out.print("-----------------------------------------------------------------------------------------------------------------------\n");
                                 }
                                 System.out.print("No."+q1+":"+com1.head().displayequipment());
                                 com1.rotateA();
                                 if (i == 1){
                                     System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
                                 }
                             }
                             start();
                             break;
                         default:
                             System.out.print("Error: Invalid input! \n");
                             awa = true;}
                 case "N":
                 case "n":
                     System.out.print("Next [1] & Prev [2] or Go Back [3]");
                      boolean maw = true;
                     while (maw){
                     String ch = scan.nextLine();
                     
                         switch (ch) {
                             case "1":
                                 com1.rotateA();
                                 System.out.print("\n\n\n\n\n");
                                 maw = false;
                                 break;
                             case "2":
                                 com1.rotateB();
                                 System.out.print("\n\n\n\n\n");
                                 maw = false;
                                 break;
                             case "3":
                                 removeequip();
                                 System.out.print("\n\n\n\n\n");
                                 maw = false;
                                 break;
                             default:
                                 System.out.print("Your input is invalid \n");
                                 maw = true;
                                 break;
                         }
                     }
                     break;
                 case "G":
                 case "g":
                     start();
                     awa = false;
                     break;
                 default:
                     System.out.print("Your input is invalid \n");
                     awa = true;
                     break;
                }
            } 
             break;
             } catch (NumberFormatException x){
                 System.out.print("Your input is invalid.");
                 System.out.print("\n\n\n\n\n");
             }
         } while (true);
    }
    
    public static void displayequipments(){
        
        if (com1.isEmpty()){
            System.out.print("There is nothing to be displayed! The Inventory in this area is empty!\n\n\n\n\n");
            start();
        }
        System.out.print("\n\n\n\n\n");
        System.out.print("\n\n\n\n\n");
        System.out.print("Equipment's Inventory\n");
        
        int q = 0;

        for(int i=com1.size();i!=0;i--){
            q++;
            if (i == com1.size()){
                System.out.print("-----------------------------------------------------------------------------------------------------------------------\n");
            }
            System.out.print("No."+q+":"+com1.head().displayequipment());
            com1.rotateA();
            if (i == 1){
                System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
            }
        }
        
         System.out.print("Press any key to continue . . . \n");
         scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("\n\n\n\n\n");
         
         start();
        
    }
    
    public static void setnewequipment(){
        
         System.out.print("Editing of Items from the Equipment inventory.\n"+"\n");
         System.out.print("NOTE: you can only edit the one who called HEAD.\n"+"\n");
         System.out.print("Press any key to continue . . . \n");
         scan.nextLine();
         System.out.print("\n\n\n\n\n");
          
         boolean awa = true;
         
         do {
             
         try{
             
         while (awa){
             
             System.out.print("\n\n Do you want to edit this? Yes[Y] or No[N] or Go back to the Menu [G] \n"+"\n\nCurrent Head: \n\n"+com1.head().displayequipment());
                String choice = scan.nextLine();
                System.out.print("\n\n\n\n\n");
             
             switch (choice) {
                 case "Y":
                 case "y":
                     setterequip();
                     break;
                 case "N":
                 case "n":
                     System.out.print("Next [1] & Prev [2] or Go Back [3]");
                     
                     boolean maw = true;
                      
                     while (maw){
                     String ch = scan.nextLine();
                                      
                         switch (ch) {
                             case "1":
                                 com1.rotateA();
                                 System.out.print("\n\n\n\n\n");
                                 maw = false;
                                 break;
                             case "2":
                                 com1.rotateB();
                                 System.out.print("\n\n\n\n\n");
                                 maw = false;
                                 break;
                             case "3":
                                 setnewequipment();
                                 System.out.print("\n\n\n\n\n");
                                 maw = false;
                                 break;
                             default:
                                 System.out.print("Your input is invalid \n");
                                 maw = true;
                                 break;
                         }
                     }
                     break;
                 case "G":
                 case "g":
                     start();
                     awa = false;
                     break;
                 default:
                     System.out.print("Your input is invalid \n");
                     awa = true;
                     break;
             }
    }  
         break;
         }catch (NumberFormatException x){
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
         }
         } while(true);
        
    }
    
    public static void choiceequip(){
        
         System.out.print("\n Do you want to edit more? [Y] or [N] \n");
             String j = scan.nextLine();             
             switch (j) {   
                 case "Y":
                 case "y":
                     setterequip();
                     break;
                 case "N":
                 case "n":
                     System.out.print("\n\n\n\n\n");
                     System.out.print("Edited Data: \n\n");
                     System.out.print(com1.head().displayequipment()+"\n");
                     System.out.print("Press any key to continue");
                     scan.nextLine();
                     start();
                     break;
                 default:
                     System.out.print("Your input is invalid!\n\n");
                     System.out.print("Press any key to continue");
                     scan.nextLine();
                     choiceequip();
                     break;                    
             }    
    }
        
    public static void setterequip(){
        
         System.out.print("What information you want edit? \n\n");
         
         System.out.print(    "Name [1]\n"
                            + "Description [2]\n"
                            + "Model [3]\n"
                            + "Name of the Supplier's Company [4]\n"
                            + "Type of Equipment [5]\n"
                            + "Date of Purchase [6]\n"
                            + "Quantity [7]\n"
                            + "Price of the Purchased Equipment [8])\n");
                  
         String choice = scan.nextLine();
         
         switch (choice){
             
             case "1":
             System.out.print("\n\n\n\n\n");
             System.out.print("Current Name: "+com1.head().getName()+"\n");
             System.out.print("New Name: ");
             String a = scan.nextLine();
             com1.head().setName(a);
             choiceequip();
             break;
              
             case "2":
             System.out.print("\n\n\n\n\n");  
             System.out.print("Current Description: "+com1.head().getDescription()+"\n");
             System.out.print("New Description: ");
             String b = scan.nextLine();
             com1.head().setDescription(b);
             choiceequip();
             break;
               
             case "3":   
             System.out.print("\n\n\n\n\n");
             System.out.print("Current Model: "+com1.head().getModel()+"\n");
             System.out.print("New Model: ");
             String c = scan.nextLine();
             com1.head().setModel(c);
             choiceequip();
             break;
                  
             case "4":
             System.out.print("\n\n\n\n\n");
             System.out.print("Current Name of the Supplier's Company: "+com1.head().getSuppliername()+"\n");
             System.out.print("New Date of Production (mm/dd/yy): ");
             String d = scan.nextLine();
             com1.head().setSuppliername(d);
             choiceequip();
             break;
             
             case "5":
             System.out.print("\n\n\n\n\n");
             System.out.print("Current Name of the Supplier's Company: "+com1.head().getType()+"\n");
             System.out.print("New Date of Production (mm/dd/yy): ");
             String e = scan.nextLine();
             com1.head().setType(e);
             choiceequip();
             break;
            
             case "6":
             System.out.print("\n\n\n\n\n");
             System.out.print("Current Date of Purchase: "+com1.head().getDatepurchase()+"\n");
             System.out.print("New Current Date of Purchase (mm/dd/yy): ");
             String f = scan.nextLine();
             com1.head().setDatepurchase(f);
             choiceequip();
             break;
             
             case "7":
             int m;
             do {
                 System.out.print("\n\n\n\n\n");
                 System.out.print("Current Quantity: "+com1.head().getQuantity()+"\n");
                 System.out.print("New Quantity: ");
                 try {
                     m = Integer.parseInt(scan.nextLine());
                     break;
                 } catch (NumberFormatException x) { 
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
             }}while (true);   
             com1.head().setQuantity(m);
             choiceequip();
             break; 
                                              
             case "8":
             Double k;
             do{
                System.out.print("\n\n\n\n\n");
                System.out.print("Current Price when purchased: "+com1.head().getPurchasedprice()+"\n");
                System.out.print("New Price when purchased: "); 
             try {          
              k = Double.parseDouble(scan.nextLine()); 
             break;     
             } catch (NumberFormatException x) { 
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
             }}while (true);
             com1.head().setPurchasedprice(k);
             choiceequip();
             break;           
             
             default:
                 System.out.print("\n\n\n\n\n");
                 System.out.print("Your input is invalid! \n\n");
                 System.out.print("Press any key to continue ....");
                 scan.nextLine();
                 setterequip();
                 
         }
    }
    
}    
