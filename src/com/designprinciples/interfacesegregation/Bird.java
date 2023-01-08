package com.designprinciples.interfacesegregation;

//public class Bird implements IAnimalAction {
//    @Override
//    public void eat () {
//        System.out.println("Bird eat");
//    }
//
//    @Override
//    public void fly () {
//        //depends on the bird type
//        System.out.println("Bird fly");
//    }
//
//    @Override
//    public void swim () {
//        //depends on the bird type
//        throw new UnsupportedOperationException("Bird can't swim");
//    }
//}

public class Bird implements IEatAnimalAction, IFlyAnimalAction {
    @Override
    public void eat () {
        System.out.println("Bird eat");
    }

    @Override
    public void fly () {
        //depends on the bird type
        System.out.println("Bird fly");
    }
}