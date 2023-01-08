package com.designprinciples.compositeaggregatereuse;

public class Test {
    public static void main ( String[] args ) {
        ProductDAO productDAO = new ProductDAO();
        productDAO.setDbConnection(new MySqlConnection());
        productDAO.addProduct();
        productDAO.setDbConnection(new PostgreSqlConnection());
        productDAO.addProduct();
    }
}
