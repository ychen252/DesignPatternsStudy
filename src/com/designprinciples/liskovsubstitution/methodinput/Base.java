package com.designprinciples.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

public abstract class Base {
    public abstract Map getMap ();

    public void foo ( HashMap map ) {
        System.out.println("Base.method");
    }

}
