package com.xworkz.assignment;

public class PlantRunner {
    public static void main(String[] args) {
        Plant plant1 = new Plant("rose","normal",2,100,4);
        plant1.setValues(2,"blue","5 hours",2,"spring");
        plant1.display();

        Plant plant2 = new Plant("lotus","normal",5,200,6);
        plant2.setValues(1,"pink","8 hours",4,"summer");
        plant2.display();

        Plant[] plants = new Plant[2];
        plants[0]=plant1;
        plants[1]=plant2;
               for(Plant ref:plants)
        {
            System.out.println(ref);
            ref.display();
        }
    }
}
