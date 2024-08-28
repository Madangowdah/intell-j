package com.xworkz.assignment;

public class Plant {
    String name;
    String type;
    double quantity;
    double cost;
    int height;
    int lifespan;
    String color;
    String sunLightHours;
    int waterNeed;
    String growingSeason;

    Plant(String name,String type,double quantity,double cost,int height)
    {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.cost = cost;
        this.height = height;
    }
    public void setValues(int lifespan,String color,String sunLightHours,int waterNeed,String growingSeason)
    {
        this.growingSeason = growingSeason;
        this.waterNeed = waterNeed;
        this.lifespan = lifespan;
        this.color = color;
        this.sunLightHours = sunLightHours;
    }
    public void display()
    {
        System.out.println("The plant name is :"+name);
        System.out.println("The plant type is :"+type);
        System.out.println("The plant quantity is :"+quantity);
        System.out.println("The plant cost is :"+cost);
        System.out.println("The plant height is :"+height);
        System.out.println("The plant lifespan is :"+lifespan);
        System.out.println("The plant color is :"+color);
        System.out.println("The plant sun light hours is :"+sunLightHours);
        System.out.println("The plant water need is :"+waterNeed);
        System.out.println("The plant growing season is :"+growingSeason);

    }
}
