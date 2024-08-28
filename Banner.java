package com.xworkz.assignment;

public class Banner {
   private String size;
   private double cost;
   private double quantity;

    Banner()
    {

    }
    Banner(String size,double cost, double quantity)
    {
        this.size = size;
        this.cost = cost;
        this.quantity = quantity;
    }
    public void display()
    {
        System.out.println("The size of banner :"+size);
        System.out.println("The cost of banner :"+cost);
        System.out.println("The quantity of banner :"+quantity);

    }
}
