package com.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    static Connection con;

    public static Connection getConnection() {
        try {

            //        Load Driver
            Class.forName("com.mysql.jdbc.Driver");
            String userName="studentreg";
            String password="studentreg";
            String url="jdbc:mysql://localhost:3306/studentadmission";
            con=DriverManager.getConnection(url, userName, password);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
