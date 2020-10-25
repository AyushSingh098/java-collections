package com.pluralsight.collectionsDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public Product removeProduct(Product product)
    {
        int position = products.indexOf(product);
        return products.remove(position);
    }

    public void displayShipment(){
        for(Product product: products){
            System.out.println(product);
        }
    }

    public void sortShipmentsByOldMethod()
    {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return ((int)o1.getCost()- (int)o2.getCost());
            }
        });
    }

    public void sortShipmentsWithNewMethod(){
        products.sort(Product.BY_COST);
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
