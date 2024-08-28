package com.xworkz.practise;

import com.xworkz.assignment.Halwa;
import com.xworkz.thursday.HalwaRun;
public class HalwaRunner {
    public static void main(String[] args) {

        Halwa name = new HalwaRun();
        name.type="carrot halwa";
        name.cost=89;
        name.color="orange";
        name.display();

        Halwa owner = new HalwaRun();
        owner.type="karachi halwa";
        owner.cost=39;
        owner.color="red";
        owner.display();

        Halwa halwa = new HalwaRun();
        halwa.type="kozhikodan halwa";
        halwa.cost=90;
        halwa.color="blue";
        halwa.display();



    }
}
