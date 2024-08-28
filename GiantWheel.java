package com.xworkz.assignment;

public class GiantWheel {
   private String location;
   private double capacity;
   private String type;

    GiantWheel()
    {
        System.out.println("constructor with zero parameters is created");
    }
    GiantWheel(String location, double capacity, String type)
    {
this.location = location;
this.capacity = capacity;
this.type = type;
    }
public void details()
{
    System.out.println("The location of Gaint wheel :"+location);
    System.out.println("The capacity of Gaint wheel :"+capacity);
    System.out.println("The type of Gaint wheel :"+type);
}
}
