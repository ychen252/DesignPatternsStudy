package com.designprinciples.dependencyinversion;

public class ReactClass implements IClass {
    @Override
    public void studyCourse () {
        System.out.println("Studying React");
    }
}
