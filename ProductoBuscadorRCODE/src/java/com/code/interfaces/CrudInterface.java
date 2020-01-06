package com.code.interfaces;

import com.code.modelo.Producto;
import java.util.List;


public interface CrudInterface {
  public List listar();
  public Producto list(int id);
  public boolean add(Producto p);
  public boolean edit(Producto p);
  public boolean delete(int id);
  
  
  public List buscarProducto (String txtProducto);
}
