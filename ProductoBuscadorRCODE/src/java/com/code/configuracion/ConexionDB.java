package com.code.configuracion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {

  Connection conx;

  public ConexionDB() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      conx = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtienda", "root", "");
    } catch (Exception e) {
      System.err.println("Error" + e);
    }
  }

  public Connection getConnection() {
    return conx;
  }
}
