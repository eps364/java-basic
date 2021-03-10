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
public class Clothing {
    private final double MIN_PRICE = 10;
    private final double TAX = 0.2;
    
    private String description;
    private double price;
    private String size = "M";
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        double price_final = 0;
        price_final = (price * TAX ) + price;
        return price_final;
    }

    public void setPrice(double price) {
        if(price < MIN_PRICE){
            this.price = MIN_PRICE;
        } else {
            this.price = price;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
}
