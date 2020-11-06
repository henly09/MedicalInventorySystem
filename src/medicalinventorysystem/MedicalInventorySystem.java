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
    
    static Scanner scan = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
       start();  
    }   
        
    public static void start(){
        
        System.out.print("Welcome to Medical Inventory Management System\n"+"\n");
        System.out.print("Press any key to continue . . . \n");
        scan.nextLine();
        System.out.print("\n\n\n\n\n");
        System.out.print("\n\n\n\n\n");
        
        System.out.print("Choose Among the Two: \n");
        System.out.print("Medicines Inventory [1] \n");
        System.out.print("Equipments Inventory [2] \n");
        System.out.print("Exit: [3] \n");
   
        int choice = Integer.parseInt(scan.nextLine());
        System.out.print("\n\n\n\n\n");
        System.out.print("\n\n\n\n\n");
        
        if (choice == 1){
            System.out.print("Insert Medicine from Inventory: [1] \n");
            System.out.print("Remove Medicine from Inventory: [2] \n");
            System.out.print("Back?: [3] \n");
            
            int aw = Integer.parseInt(scan.nextLine());
            System.out.print("\n\n\n\n\n");
            
            switch (aw) {
                case 1: 
                    insertMedicine();
                    break;
                case 2:
                    if (com2.isEmpty()){
                        System.out.print("There is nothing to be remove in the invetory of medicine./n");
                        start();}
                    removemedicine();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Invalid Choice");
                    start();
                    break;
            }
        }      
    }
    
    public static void insertMedicine(){
        
         System.out.print("Insertion of Items into inventory.\n"+"\n");
         System.out.print("Press any key to continue . . . \n");
         scan.nextLine();
         System.out.print("\n\n\n\n\n");
        
         String a,b,c,d,f; 
         int e;
        
         System.out.print("Name of the Medicine: ");
         a = scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("Description of the "+a+" Medicine: ");
         b = scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("Quality of the Medicine "+a+": ");
         c = scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("Date of the Production of the "+a+":");
         d = scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("Quantity: ");
         e = Integer.parseInt(scan.nextLine());
         System.out.print("\n\n\n\n\n");
         System.out.print("Date of Expiration: ");
         f = scan.nextLine();
         System.out.print("\n\n\n\n\n");


//        com2.addlast(new inventorymedicine("Paracetamol","For Fever and Flu","Generic","11/12/13",14,"12/31/20"));
//        com2.addlast(new inventorymedicine("Neozep","For Cold and Runny Nose","Generic","11/12/13",14,"12/31/20"));
//        com2.addlast(new inventorymedicine("Ambroxol","Cough and dry throat","Generic","11/12/13",14,"12/31/20"));
//        com2.addlast(new inventorymedicine("Cetirizine","For Allergies","Generic","11/12/13",14,"12/31/20"));
//        com2.addlast(new inventorymedicine("Limotil","For Stomach ache","Generic","11/12/13",14,"12/31/20"));

         
        com2.addfirst(new inventorymedicine(a,b,c,d,e,f));
       
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
        
        System.out.print("Do you want to add more medicine? Yes[Y] || No[N] ");
        String choice = scan.nextLine();
        System.out.print("\n\n\n\n\n");
       
        boolean waw = true;  
          
        while (waw){
            switch (choice) {
            case "Y":
            case "y":
                insertMedicine();
                waw = false;
                break;
            case "N":
            case "n":
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
                scan.nextLine();
                start();
                waw = false;
                break;
            default:
                System.out.print("Error: Invalid Choice.");
                
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
             
             System.out.print("Do you want to remove this? Yes[Y] or No[N] or Go back to the Menu [G] \n "+"Current Head: "+com2.head().displaymedicine());
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
                                 System.out.print("There is nothing to be remove in the invetory of medicine./n");
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
                             System.out.print("Error: Invalid input!");
                             awa = true;
                     } break;
                 case "N":
                 case "n":
                     System.out.print("Next [1] & Prev [2] or Go Back [3]");
                     String ch = scan.nextLine();
                     boolean maw = true;
                     while (maw){
                         
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
                     System.out.print("Your input is invalid");
                     awa = true;
                     break;
             }
    }  
    
    
}
}    
