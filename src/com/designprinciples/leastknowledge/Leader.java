package com.designprinciples.leastknowledge;

import java.util.ArrayList;
import java.util.List;

public class Leader {
    public int checkNumberOfCourses () {
        System.out.println("Leader check number of courses");
        List<Product> productList = new ArrayList<Product>();
        return productList.size();
    }
}
