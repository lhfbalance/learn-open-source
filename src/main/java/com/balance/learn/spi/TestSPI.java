package com.balance.learn.spi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestSPI {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tsetjdbc");
    }

}
