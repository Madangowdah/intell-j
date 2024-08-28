package com.xworkz.thursday;

public class Bike {

        private String[] bikeNames =new String[7];
        private  int index;
        public void store(String name)
        {
            this.bikeNames[this.index]=name;
            this.index++;

        }
        public void display(){
            for(String ref:bikeNames){
                System.out.println(ref);
            }

        }

        public static void main(String[] args) {
            Bike bike = new Bike();
            bike.store("KTM");
            bike.store("GT 650");
            bike.store("Sprinter");
            bike.store("Rapid Racer");
            bike.store("bmw");
            bike.store("duke");
            bike.store("pulsar");

            bike.display();


        }}

