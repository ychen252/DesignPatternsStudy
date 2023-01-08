package com.designprinciples.openclose;

public class Test {
    public static void main ( String[] args ) {
        ICourse javaCourse = new JavaDiscountCourse(1, "Open/Close Principle", 500d);
        System.out.println(javaCourse.getId() + ", " + javaCourse.getName() + ", $" + javaCourse.getPrice());
        JavaDiscountCourse jds = (JavaDiscountCourse) javaCourse;
        System.out.println(jds.getId() + ", " + jds.getName() + ", $" + jds.getOriginalPrice());
    }
}
