package com.designprinciples.singleresponsibility;

public class WalkingBird extends Bird {
    @Override
    public void mainMoveMode ( String birdName ) {
        System.out.println(birdName + " walk");
    }
}
