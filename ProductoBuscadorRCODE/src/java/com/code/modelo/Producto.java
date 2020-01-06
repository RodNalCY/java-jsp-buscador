package com.code.modelo;

public class Producto {
  
  private int id;
  private String nombre;
  private String f_produccion;
  private String f_vencimiento;
  private double precio;
  private int    stock;

  public Producto() {
  }

  public Producto(int id, String nombre, String f_produccion, String f_vencimiento, double precio, int stock) {
    this.id = id;
    this.nombre = nombre;
    this.f_produccion = f_produccion;
    this.f_vencimiento = f_vencimiento;
    this.precio = precio;
    this.stock = stock;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getF_produccion() {
    return f_produccion;
  }

  public void setF_produccion(String f_produccion) {
    this.f_produccion = f_produccion;
  }

  public String getF_vencimiento() {
    return f_vencimiento;
  }

  public void setF_vencimiento(String f_vencimiento) {
    this.f_vencimiento = f_vencimiento;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }
  
  
}
