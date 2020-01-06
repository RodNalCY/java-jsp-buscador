
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.code.configuracion.ConexionDB"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.code.modelo.Producto"%>
<%@page import="java.util.List"%>
<%@page import="com.code.dao.ProductoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Productos</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

  </head>
  <body>
    <div class="container">

      <br>
      <h1>Productos</h1>
      <form>     
        <div class="row">
          <div class="col-6">
            <input class="form-control" type="search" placeholder="Producto" aria-label="Search" name="txtproducto">
          </div>
          <div class="col-6">
            <button class="btn btn-outline-success" type="submit" name="accion" value="buscar">Buscar</button>
          </div>
        </div>        
      </form>
  
      <br>
      <table class="table table-dark">
        <thead>
          <tr>
            <th scope="col">ID</th>
            <th scope="col">NOMBRE</th>
            <th scope="col">PRODUCCIÓN</th>
            <th scope="col">VENCIMIENTO</th>
            <th scope="col">PRECIO</th>
            <th scope="col">STOCK</th>
            <th>ACCIONES</th>
          </tr>
        </thead>
        <%
          ProductoDAO dao = new ProductoDAO();
          List<Producto> list = dao.listar();
          Iterator<Producto> iter = list.iterator();
          Producto pro = null;
          while (iter.hasNext()) {
            pro = iter.next();

        %>
        <tbody>
          <tr>
            <th scope="row"><%= pro.getId()%></th>
            <td><%= pro.getNombre()%></td>
            <td><%= pro.getF_produccion()%></td>
            <td><%= pro.getF_vencimiento()%></td>
            <td><%= pro.getPrecio()%></td>
            <td><%= pro.getStock()%></td>
            <td>
              <button type="button" class="btn btn-outline-danger">Eliminar</button>
              <button type="button" class="btn btn-outline-warning">Editar</button>
              <button type="button" class="btn btn-outline-info">Detalles</button>
            </td>
          </tr>   
          <%
            }
          %>
        </tbody>

      </table>

    </div>

  </body>
</html>
