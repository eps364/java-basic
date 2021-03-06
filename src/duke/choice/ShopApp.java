/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

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

        Customer c1 = new Customer("Pinky", 14);
        System.out.println("Min Price: " + Clothing.MIN_PRICE);
        System.out.println("Tax Rate: " + Clothing.TAX_RATE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, item3, item4};

        c1.addItems(items);
        Arrays.sort(c1.getItems());

        System.out.println("Nome: " + c1.getName());
        System.out.println("Size: " + c1.getSize());
        System.out.println("Size of measurement: " + c1.getSize() + "\n");

        for (Clothing item : c1.getItems()) {
            System.out.println("Item: " + item);
        }

        System.out.println("\nTotal: " + c1.getTotalClothongCost());
        System.out.println("Average price: " + c1.averagePrice(c1.getSize()));

        try {
            ItemList list = new ItemList(items);

            Routing routing = Routing
                    .builder()
                    .get("/items", list)
                    .build();
            ServerConfiguration config = ServerConfiguration
                    .builder()
                    .bindAddress(InetAddress
                        .getLocalHost())
                        .port(8888)
                    .build();

            WebServer ws = WebServer.create(config, routing);

            ws.start();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
