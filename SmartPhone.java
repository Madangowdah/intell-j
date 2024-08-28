package com.xworkz.assignment;

public class SmartPhone {

    public String name;
    public double cost;
    public int quantity;
    public String storage;

    public SmartPhone()
    {
     super();
    }
    public void details(String name,double cost,int quantity,String storage)
    {
        System.out.println("the phone name is :"+name);
        System.out.println("the cost is:"+cost);
        System.out.println("Number of quantity :"+quantity);
        System.out.println("phone storage is :"+storage);
    }
}
