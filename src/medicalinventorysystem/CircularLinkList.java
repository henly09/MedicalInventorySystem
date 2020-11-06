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
public class CircularLinkList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


//------------------------------------------ Rotation A (Head to Tail) Singly Linked List --------------------------------------------        
        
     

        dlistcll<String> dcll = new dlistcll<>(); 
        
        dcll.addlast("1");
        dcll.addlast("2");
        dcll.addlast("3");
         
        System.out.print("Head: " + dcll.head() +"\n"+ "Tail: " + dcll.tail() +"\n"+ "Size: "+ dcll.size() +"\n"+"\n");
        dcll.rotateA();
        System.out.print("Head: " + dcll.head() +"\n"+ "Tail: " + dcll.tail() +"\n"+ "Size: "+ dcll.size() +"\n"+"\n");
        dcll.rotateB();
        System.out.print("Head: " + dcll.head() +"\n"+ "Tail: " + dcll.tail() +"\n"+ "Size: "+ dcll.size() +"\n"+"\n");
        dcll.rotateA();
        System.out.print("Head: " + dcll.head() +"\n"+ "Tail: " + dcll.tail() +"\n"+ "Size: "+ dcll.size() +"\n"+"\n");
        dcll.rotateA();
        System.out.print("Head: " + dcll.head() +"\n"+ "Tail: " + dcll.tail() +"\n"+ "Size: "+ dcll.size() +"\n"+"\n");
        dcll.rotateB();
        System.out.print("Head: " + dcll.head() +"\n"+ "Tail: " + dcll.tail() +"\n"+ "Size: "+ dcll.size() +"\n"+"\n");
        
       
       
        
 

    }
    
}
