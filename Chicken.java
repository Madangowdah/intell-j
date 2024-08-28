package com.xworkz.assignment;

public class Chicken {
    public String type;
    public double quantity;
    public double cost;
    public String name;
    public String brand;
    public double discount;
    public boolean delivered;

    public Chicken() {
super();
    }
    public void detail1(String type,double quantity,double cost)
    {
        System.out.println(type);
        System.out.println(quantity);
        System.out.println(cost);
    }
    public void detail2(String name, String brand, double discount)
    {
        System.out.println(name);
        System.out.println(brand);
        System.out.println(discount);
    }
    public void detail3(boolean delivered) {
        System.out.println(delivered);
    }
}
