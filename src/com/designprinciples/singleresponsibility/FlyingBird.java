package com.designprinciples.singleresponsibility;

public class FlyingBird extends Bird {
    @Override
    public void mainMoveMode ( String birdName ) {
        System.out.println(birdName + " fly");
    }
}
