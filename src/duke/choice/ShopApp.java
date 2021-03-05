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
        double tax = 0.2;
        double total = 0;
       
        Customer c1= new Customer();
        c1.name = "Pinky";
        c1.size = "S";
        
        
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
       
        Clothing[] itens  = {item1, item2};
        
        item1.description = "Blue Jacket";
        item1.price = 20.9;        
        item1.size = "M";
        
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;        
        item2.size = "S";
        
        System.out.println("Nome: " + c1.name);
        System.out.println("Size: " + c1.size);
        
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
        for(Clothing item:itens){
            total += item.price * (1 + tax);
            System.out.println(item.description +";"+ item.price+";"+item.size);
        }
        System.out.println("Total: "+ total);
        
        int measurement = 10;
        
        switch(measurement){
            case 1:
            case 2:
            case 3:
                c1.size = "S";
                break;
            case 4:
            case 5: 
            case 6:
                c1.size = "M";
                break;
            case 7:
            case 8:
            case 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }
        
        System.out.println("Size of measurement: " + c1.size);
        

        
    }
    
}
