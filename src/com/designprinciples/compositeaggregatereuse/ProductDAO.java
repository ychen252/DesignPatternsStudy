package com.designprinciples.compositeaggregatereuse;

public class ProductDAO{
    private DbConnection dbConnection;

    public void setDbConnection ( DbConnection dbConnection ) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        System.out.println("Added product to " + dbConnection.getConnection());
    }
}
