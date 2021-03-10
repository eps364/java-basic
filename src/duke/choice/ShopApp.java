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
        System.out.println("Welcome to Duke Choice Shop\n");
        double tax = 0.2;
        double total = 0;

        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");

//        if(measurement <= 3 ){
//            c1.size =  "S";
//        } else if (measurement <= 6){
//            c1.size = "M";
//        } else if (measurement <=9){
//            c1.size = "L";
//        } else {
//            c1.size = "X";
//        }
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();

        Clothing[] itens = {item1, item2, new Clothing(), new Clothing()};

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        itens[2].setDescription("Green Scarf");
        itens[2].setPrice(5);
        itens[2].setSize("S");
        
        itens[3].setDescription("Blue T-Shirt");
        itens[3].setPrice(10.5);
        itens[3].setSize("S");

        System.out.println("Nome: " + c1.getName());
        System.out.println("Size: " + c1.getSize());

//        System.out.println(item1.description +";"+ item1.price+";"+item1.size);
//        System.out.println(item2.description +";"+ item2.price+";"+item2.size);
// Example for com break or continue       
//        int[] sizes = {4,18,5,20};
//        for (int size: sizes){
//            //if(size > 16 ) break;
//            if(size > 16 ) continue;
//            System.out.println("Size: "+ size + ",");
//        }
//        total = ((item1.price * tax)+item1.price) + ((item2.price * tax)+item2.price);
        for (Clothing item : itens) {
            if (item.getSize().equals(c1.getSize())) {
                total += item.getPrice();
                System.out.println("Item: " + item.getDescription() + ";" + item.getPrice() + ";" + item.getSize());
                if (total > 15) {
                    break;
                }
            }
        }

        System.out.println("Total: " + total);

        c1.setSize(3);
        
        System.out.println("Size of measurement: " + c1.getSize());

    }

}
