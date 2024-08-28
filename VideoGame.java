package com.xworkz.assignment;

public class VideoGame {
   private String name;
   private double cost;
   private int size;

    VideoGame()
    {

    }
    VideoGame(String name,double cost,int size)
    {
        this.name = name;
        this.cost = cost;
        this.size = size;
        System.out.println("created constructor with parameters");
    }
    public void details()
    {
        System.out.println("the name of VideoGame :"+name);
        System.out.println("the VideoGame cost :"+cost);
        System.out.println("the size of VideoGame :"+size);
    }

}
