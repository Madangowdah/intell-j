package com.xworkz.assignment;

public class Garland {
    private String colour;
    private double quantity;
    private double cost;

    Garland()
    {

    }
    Garland(String colour,double quantity,double cost)
    {
        this.colour = colour;
        this.quantity = quantity;
        this.cost = cost;
    }
    public void display()
    {
        System.out.println("The Garland colour is :"+colour);
        System.out.println("The Garland quantity is :"+quantity);
        System.out.println("The Garland cost is :"+cost);
    }
}
