package com.pluralsight.collectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Product door = new Product("wooden door", 12.0f);
        Product floorPanel = new Product("Floor Panel", 32.0f);
        Product window = new Product("Glass window", 22.0f);

        Shipment shipment = new Shipment();

        shipment.addProduct(door);
        shipment.addProduct(floorPanel);
        shipment.addProduct(window);
        //shipment.sortShipmentsByOldMethod();
        shipment.sortShipmentsWithNewMethod();
        for(Product product: shipment){

            System.out.println(product);
        }


    }
}
