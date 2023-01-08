package com.designprinciples.singleresponsibility;

public class Test {
    public static void main ( String[] args ) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("Avo");
//        bird.mainMoveMode("Ostrich");
        WalkingBird walkingBird = new WalkingBird();
        walkingBird.mainMoveMode("Ostrich");
        FlyingBird flyingBird = new FlyingBird();
        flyingBird.mainMoveMode("Avo");
    }
}
