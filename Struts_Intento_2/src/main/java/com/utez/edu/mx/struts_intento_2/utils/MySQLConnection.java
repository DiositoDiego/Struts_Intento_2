package com.utez.edu.mx.struts_intento_2.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    private static final String HOST = "localhost";
    private static final String DBNAME = "capacitacion";
    private static final String USER = "userd";
    private static final String PASSWORD = "userd";
    private static final String PORT = "3306";

    public static Connection getConnection() throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection("jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME+"?serverTimezone=UTC", USER, PASSWORD);
    }

    public static void main(String[] args) {
        try {
            Connection con = MySQLConnection.getConnection();
            System.out.println("Conectado a la base");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
