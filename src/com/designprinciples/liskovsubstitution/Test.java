package com.designprinciples.liskovsubstitution;

public class Test {
    public static void resize(Rectangle rectangle ){
        while(rectangle.getWidth() < rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("Width: + " + rectangle.getWidth() + " Length: " + rectangle.getLength());
        }
        System.out.println("resize finished: Width: " + rectangle.getWidth() + " Length: " + rectangle.getLength());
    }

    //Liskov Substitution Principle - 1, when change the method input parameter from Rectangle to IQuadrangle,
    // the method will not work,
    // but when using sub class instance to replace the base class instance, the method should work
    public static void main ( String[] args ) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
//        Square square = new Square();
//        resize(square);
    }
}
