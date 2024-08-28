package com.xworkz.assignment;
public class BikeRunner {
  private String name;

  BikeRunner(String name)
  {
this.name=name;
  }
  public void display()
  {
      System.out.println(name);
  }

    public static void main(String[] args) {

      BikeRunner bikeRunner1 = new BikeRunner("hii");
      bikeRunner1.display();

        BikeRunner bikeRunner2 = new BikeRunner("hello");
        bikeRunner2.display();

        BikeRunner[] reeef = new BikeRunner[2];
        reeef[0] = bikeRunner1;
        reeef[1] = bikeRunner2;

        for(BikeRunner ref:reeef)
        {
          System.out.println(ref);
          ref.display();
        }

    }
}
