/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    }
    
//------------------------------------------------------------------------------------------------- Codes in Medicine Inventory
    
    public static void medicinechoice(){
        boolean law = true;
        
        while (law){
            
            System.out.print("Insert Medicine into Inventory: [1] \n");
            System.out.print("Remove Medicine from Inventory: [2] \n");
            System.out.print("Back?: [3] \n");
            
            int aw = Integer.parseInt(scan.nextLine());
            System.out.print("\n\n\n\n\n");
            
            switch (aw) {
                case 1: 
                    insertMedicine();
                    law = false;
                    break;
                case 2:
                    if (com2.isEmpty()){
                        System.out.print("There is nothing to be remove in the invetory of medicine.\n");
                        start();}
                    removemedicine();
                    law = false;
                    break;  
                case 3:
                    start();
                    law = false;
                    break;
                default:
                    System.out.print("Invalid Choice\n\n");
                    law = true;
                    break;
            }
        }
    }
    
    public static void insertMedicine(){
        
         System.out.print("Insertion of Items into inventory.\n"+"\n");
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
         System.out.print("Type of Medicine (Syrup/Tablet/Injetion): ");
         h = scan.nextLine();
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
//                                 
        com2.addfirst(new inventorymedicine(a,b,c,d,e,f,g,h,i,j,k,l,m));
       
        int qe = 0;

        for(int ie=com2.size();ie!=0;ie--){
            qe++;
            if (ie == com2.size()){
                System.out.print("-----------------------------------------------------------------------------------------------------------------------\n");
            }
            System.out.print("No."+qe+":"+"\n"+com2.head().displaymedicine());
            com2.rotateA();
            if (ie == 1){
                System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
            }
        }
        
        System.out.print("Press any key to continue . . . \n");
        scan.nextLine();
        System.out.print("\n\n\n\n\n");
       
        boolean waw = true;  
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
            System.out.print("No."+q1+":"+com2.head().displaymedicine());
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
    }   
    
    public static void removemedicine(){
        
         System.out.print("Removing of Items into inventory.\n"+"\n");
         System.out.print("NOTE: you can only remove the one who called HEAD.\n"+"\n");
         System.out.print("Press any key to continue . . . \n");
         scan.nextLine();
         System.out.print("\n\n\n\n\n");
          
         boolean awa = true;
         
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
        
//-------------------------------------------------------------------------------------------------- Codes in Hospital Equipment Inventory   
    
    
    public static void equipmentchoice(){
        
        boolean law = true;
        
        while (law){
            
            System.out.print("Insert Equipment into Inventory: [1] \n");
            System.out.print("Remove Equipment from Inventory: [2] \n");
            System.out.print("Back?: [3] \n");
            
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
                    start();
                    law = false;
                    break;
                default:
                    System.out.print("Invalid Choice\n\n");
                    law = true;
                    break;
            }
        }
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
//         
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
        
    }
    
    public static void removeequip(){
        
        System.out.print("Removing of Items into inventory.\n"+"\n");
         System.out.print("NOTE: you can only remove the one who called HEAD.\n"+"\n");
         System.out.print("Press any key to continue . . . \n");
         scan.nextLine();
         System.out.print("\n\n\n\n\n");
          
         boolean awa = true;
         
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
                                 System.out.print("There is nothing to be remove in the invetory of medicine.\n");
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
        
        
    }
    
    public static void displayequipments(){
        
        if (com1.isEmpty()){
            System.out.print("There is nothing to be displayed! The Inventory in this area is empty!\n\n\n\n\n");
            start();
        }
        System.out.print("\n\n\n\n\n");
        System.out.print("\n\n\n\n\n");
        System.out.print("Medicine's Inventory\n");
        
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
        
}    
