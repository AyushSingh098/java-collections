package com.pluralsight.collectionsDemo;

public class Product {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    private String name;
    private float cost;

    public Product(){
    }

    public Product(String name){
        this.name = name;
    }

    public Product(String name, float cost)
    {
        this(name);
        this.cost = cost;
    }

}
