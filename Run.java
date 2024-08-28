package com.xworkz.assignment;

public class Run {
    public static void main(String[] args) {
        VideoGame videoGame = new VideoGame();
        videoGame.details();

        VideoGame videoGame1 = new VideoGame("PUBG",500,900);
        videoGame1.details();

        VideoGame[] name = {videoGame,videoGame1};
        for(int len = 0;len<name.length;len++)
        {
          VideoGame ref = name[len];
        }
    }
}
