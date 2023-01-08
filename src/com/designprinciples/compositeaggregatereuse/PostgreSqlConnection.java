package com.designprinciples.compositeaggregatereuse;

public class PostgreSqlConnection extends DbConnection {
    @Override
    public String getConnection() {
        return "PostgreSql Connection";
    }
}
