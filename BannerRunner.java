package com.xworkz.assignment;

public class BannerRunner {
    public static void main(String[] args) {
        Banner banner = new Banner();
        banner.display();

        Banner banner1 = new Banner("medium",500,2);
        banner1.display();

        Banner[] name = {banner,banner1};
        for(int len =0;len<name.length;len++)
        {
          Banner ref = name[len];

        }
    }
}
