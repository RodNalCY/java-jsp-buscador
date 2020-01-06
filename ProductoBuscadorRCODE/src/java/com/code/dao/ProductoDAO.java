package com.code.dao;

import com.code.configuracion.ConexionDB;
import com.code.interfaces.CrudInterface;
import com.code.modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO implements CrudInterface {

  ConexionDB condb = new ConexionDB();
  Connection con;
  PreparedStatement pst;
  ResultSet rs;
  Producto pro = new Producto();

  @Override
  public List listar() {

    ArrayList<Producto> list = new ArrayList<>();
    String sql = "select * from producto";
    try {
      con = condb.getConnection();
      pst = con.prepareStatement(sql);
      rs = pst.executeQuery();
      while (rs.next()) {
        Producto p = new Producto();
        p.setId(rs.getInt("id"));
        p.setNombre(rs.getString("nombre"));
        p.setF_produccion(rs.getString("f_produccion"));
        p.setF_vencimiento(rs.getString("f_vencimiento"));
        p.setPrecio(rs.getDouble("precio"));
        p.setStock(rs.getInt("stock"));
        list.add(p);
      }
    } catch (Exception e) {
    }
    return list;

  }

  @Override
  public Producto list(int id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean add(Producto p) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean edit(Producto p) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean delete(int id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List buscarProducto(String txtProducto) {

    List<Producto> lista = new ArrayList<>();
    String sql = "SELECT * FROM producto WHERE id LIKE '%"+txtProducto+"%'";
    try {
      con = condb.getConnection();
      pst = con.prepareStatement(sql);
      rs = pst.executeQuery();
      while (rs.next()) {
        Producto p = new Producto();
        p.setId(rs.getInt("id"));
        p.setNombre(rs.getString("nombre"));
        p.setF_produccion(rs.getString("f_produccion"));
        p.setF_vencimiento(rs.getString("f_vencimiento"));
        p.setPrecio(rs.getDouble("precio"));
        p.setStock(rs.getInt("stock"));
        lista.add(p);
      }
    } catch (Exception e) {
    }

    return lista;
  }

}
