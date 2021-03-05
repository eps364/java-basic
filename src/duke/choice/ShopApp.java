/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

/**
 *
 * @author Emerson Pereira da Silva
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("HelloWorld!");
        Customer c1= new Customer();
        c1.name = "Pinky";
        System.out.println("Nome: " + c1.name);
        
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        
        item1.description = "Blue Jacket";
        item1.price = 20.9;        
        item1.size = "M";
        
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;        
        item2.size = "S";
        
        System.out.println(item1.description +";"+ item1.price+";"+item1.size);
        System.out.println(item2.description +";"+ item2.price+";"+item2.size);
    }
    
}
