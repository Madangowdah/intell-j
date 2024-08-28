package com.xworkz.assignment;

public class GaintWheelRunner {
    public static void main(String[] args) {

        GiantWheel giantWheel = new GiantWheel();
        giantWheel.details();

        GiantWheel giantWheel1 = new GiantWheel("Wonderla",50,"normal");
        giantWheel1.details();

        GiantWheel[] name = {giantWheel,giantWheel1};
        for(int len = 0;len<name.length;len++)
        {
            GiantWheel ref = name[len];
        }
    }
}
