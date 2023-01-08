package com.designprinciples.dependencyinversion;

public class Test {
//v1
//    public static void main ( String[] args ) {
//        Aaron aaron = new Aaron();
//        aaron.studyJava();
//        aaron.studyReact();
//    }

//v2
//    public static void main ( String[] args ) {
//        Aaron aaron = new Aaron();
//        aaron.studyCourse(new JavaClass());
//        aaron.studyCourse(new ReactClass());
//    }

//v3
//    public static void main ( String[] args ) {
//        Aaron aaron = new Aaron(new JavaClass());
//        aaron.studyCourse();
//        Aaron aaron1 = new Aaron(new ReactClass());'
//        aaron1.studyCourse();
//    }

    public static void main ( String[] args ) {
        Aaron aaron = new Aaron();
        aaron.setCourse(new JavaClass());
        aaron.studyCourse();
        aaron.setCourse(new ReactClass());
        aaron.studyCourse();
    }
}
