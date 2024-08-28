package com.xworkz.assignment;

public class Ball {

        private String material;
        private String color;
        private double diameter;
        private double weight;
        private String brand;

        private String sport;
        private boolean isInflated;
        private int bounceHeight;

        private int hardness;
        private String surfaceType;
        private boolean isWaterproof;
        private String countryOfOrigin;
        private int durability;


        // Constructor
        public Ball(String material, String color, double diameter, double weight, String brand, String sport, boolean isInflated, int bounceHeight) {
            this.material = material;
            this.color = color;
            this.diameter = diameter;
            this.weight = weight;
            this.brand = brand;
            this.sport = sport;
            this.isInflated = isInflated;
            this.bounceHeight = bounceHeight;
        }

        // Methods
        public void setHardness(int hardness)
        {
            this.hardness = hardness;
        }
        public void setSurfaceType(String surfaceType)
        {
            this.surfaceType = surfaceType;
        }
        public void setIsWaterproof(boolean isWaterproof)
        {
            this.isWaterproof = isWaterproof;
        }
        public void setCountryOfOrigin(String countryOfOrigin)
        {
            this.countryOfOrigin = countryOfOrigin;
        }
        public void setDurability(int durability)
        {
            this.durability = durability;
        }
        // (add more setter methods)

        public void printDetails() {
            System.out.println("Ball: " + material + ", Color: " + color + ", Diameter: " + diameter + "cm, Weight: " + weight + "kg, Brand: " + brand);
            System.out.println("Sport: " + sport + ", Inflated: " + isInflated + ", Bounce Height: " + bounceHeight + "cm, Hardness: " + hardness + ", Surface Type: " + surfaceType);
            // (print more details)
        }
    }
