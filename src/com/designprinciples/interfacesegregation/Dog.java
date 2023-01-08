package com.designprinciples.interfacesegregation;

//public class Dog implements IAnimalAction {
//    @Override
//    public void eat () {
//        System.out.println("Dog eat");
//    }
//
//    @Override
//    public void fly () {
//        // Do nothing
//    }
//
//    @Override
//    public void swim () {
//        System.out.println("Dog swim");
//    }
//}

public class Dog implements IEatAnimalAction, ISwimAnimalAction {
    @Override
    public void eat () {
        System.out.println("Dog eat");
    }

    @Override
    public void swim () {
        System.out.println("Dog swim");
    }
}