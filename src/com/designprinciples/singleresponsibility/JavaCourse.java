package com.designprinciples.singleresponsibility;

public class JavaCourse implements ICourseContent, ICourseManager {
    //interface segregation principle
    @Override
    public String getCourseName () {
        return "Java Course";
    }

    @Override
    public byte[] getCourseVideo () {
        return new byte[0];
    }

    @Override
    public void studyCourse () {
        System.out.println("Studying Java");
    }

    @Override
    public void refundCourse () {
        System.out.println("Refunding Java");
    }

}
