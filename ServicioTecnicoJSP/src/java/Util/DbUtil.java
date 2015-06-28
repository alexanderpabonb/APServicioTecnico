/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author AlexPabon
 */
public class DbUtil {
    
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null) {
            return connection;
        } else {
            try {
                // Load the JDBC driver
                Class.forName("Oracle.jdbc.OracleDriver");
                //com.microsoft.sqlserver.jdbc.SQLServerDriver

                System.out.println("Driver loaded");

                String userName = "SYSTEM";
                String password = "0707";

                //String url = "jdbc:sqlserver://localhost:1433" + ";databaseName=UserDB";
                String url = "jdbc:oracle:thin:@localhost:1521:XE";
                 connection = DriverManager.getConnection(url, userName, password);
            } catch (Exception ex) {
                System.out.println(ex);
            }
            return connection;
        }
    }
    
}
