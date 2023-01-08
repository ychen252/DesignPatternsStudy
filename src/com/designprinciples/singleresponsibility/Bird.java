package com.designprinciples.singleresponsibility;

public class Bird {
    public void mainMoveMode ( String birdName ) {
        if(birdName.equals("Ostrich")){
            System.out.println(birdName + " walk");
        } else {
            System.out.println(birdName + " fly");
        }
    }
}
