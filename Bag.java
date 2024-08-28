package com.xworkz.thursday;

public class Bag {

   private String[] bags = new String[2];
    private int index=0;


    public void save(String names)
    {
        bags[index]=names;
        index++;
    }

    public void display()
    {
        for(String ref:bags)
        {
            System.out.println(ref);
        }

    }

    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.save("skybags");
        bag.display();

        Bag bag1 = new Bag();
        bag1.save("wildcraft");
        bag1.display();


    }
}
