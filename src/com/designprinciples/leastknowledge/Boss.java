package com.designprinciples.leastknowledge;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    public void commandCheckNumber (Leader leader) {
        System.out.println("Boss command leader to check number of courses");

//        List<Product> productList = new ArrayList<Product>();
//        leader.checkNumberOfCourses(productList);

//        should only communicate with the leader, not the product list
        leader.checkNumberOfCourses();
    }
}
