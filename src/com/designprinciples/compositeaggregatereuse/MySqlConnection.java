package com.designprinciples.compositeaggregatereuse;

public class MySqlConnection extends DbConnection {
    @Override
    public String getConnection() {
        return "MySQL connection";
    }
}
