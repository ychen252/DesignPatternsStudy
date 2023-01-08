package com.designprinciples.liskovsubstitution.methodinput;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main ( String[] args ) {
        Sub sub = new Sub();
        sub.foo(new HashMap());
        sub.foo(new TreeMap());
    }
}
