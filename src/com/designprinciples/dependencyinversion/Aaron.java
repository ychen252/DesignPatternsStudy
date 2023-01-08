package com.designprinciples.dependencyinversion;

public class Aaron {
    private IClass course;

    public void setCourse ( IClass course ) {
        this.course = course;
    }

    public void studyCourse(){
        course.studyCourse();
    }
}
