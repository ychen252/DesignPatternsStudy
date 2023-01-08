package com.designprinciples.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sub extends Base {
//    @Override
//    public void foo ( HashMap map ) {
//        System.out.println("Child.method using HashMap Parameter");
//    }


    //Liskov Substitution Principle - 2
    //when sub class overwrites the base method, parameter should be same or more generic class
    public void foo ( Map map ) {
        System.out.println("Child.method using Map Parameter");
    }

    //Liskov Substitution Principle - 3
    // when sub class overrides base class abstract method, returned class should be same or child class
    @Override
    public HashMap getMap () {
        return new HashMap();
    }
}
