package com.xworkz.assignment;

public class GarlandRunner {
    public static void main(String[] args) {
        Garland garland = new Garland();
        garland.display();

        Garland garland1 = new Garland("red",2,200);
        garland1.display();

        Garland[] name = {garland,garland1};
        for(int len = 0;len < name.length;len++)
        {
            Garland ref = name[len];
        }
    }
}
