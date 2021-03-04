/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

/**
 *
 * @author emerson.pereira
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("HelloWorld!");
        Customer c1= new Customer();
        
        c1.name = "Pinky";
//        c1.setName("Pinky");
//        
//        System.out.println("Nome: " + c1.getName());

        System.out.println("Nome: " + c1.name);
    }
    
}
