package com.designprinciples.dependencyinversion;

public class JavaClass implements IClass {
    @Override
    public void studyCourse () {
        System.out.println("Studying Java");
    }
}
