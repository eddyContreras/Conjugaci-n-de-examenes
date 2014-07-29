/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conjuexamen;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase que implementa los servicios para devolver consultas
 * @author hp
 */
public class servicios extends SQLQuery{
    /**
     * Devuelve todos los campos de la tabla
     * @param nombreTabla Nombre de la tabla a la que queremos acceder.
     * @return el resultado de la consulta.
     * @throws SQLException Error al ejecutar.
     */
    
    //METODOS PARA RECUPERAR DE LA BD.
    private String titulo;
    
    public ResultSet getTodos(String nombreTabla) throws SQLException{
        String sql;
        sql="SELECT * FROM "+nombreTabla;
        pstmt = conn.prepareStatement(sql);
        pstmt.executeQuery();
        rs=pstmt.getResultSet();
        return rs;
    }
    public ResultSet getColumna(String nombreTabla) throws SQLException{
        String sql;
       String titulo="tituloexamen";
        sql="SELECT DISTINCT "+titulo+" FROM "+nombreTabla;
        pstmt = conn.prepareStatement(sql);
        pstmt.executeQuery();
        rs=pstmt.getResultSet();
    return rs;
    }
    
    public ResultSet getTodosconsult(String nombreTabla,String condicion) throws SQLException{
    String sql;
        sql="SELECT * FROM "+nombreTabla+" where tituloexamen = "+condicion+"";
        pstmt = conn.prepareStatement(sql);
        pstmt.executeQuery();
        rs=pstmt.getResultSet();
    return rs;
    }
    
    public ResultSet getconsulta(String sql) throws SQLException{
        pstmt=conn.prepareStatement(sql);
        pstmt.executeQuery();
        rs=pstmt.getResultSet();
        return rs;
    
    }
    public ResultSet getTodosconsult1(String nombreTabla,String condicion) throws SQLException{
    String sql;
        sql="SELECT * FROM "+nombreTabla+" where tituloexamen<>"+condicion;
        pstmt = conn.prepareStatement(sql);
        pstmt.executeQuery();
        rs=pstmt.getResultSet();
    return rs;
    }
    
    // METODO PARA MODIFICAR, UNSERTAR EN LA BASE DE DATOS.
    public void consulta(String sql) throws SQLException{
        pstmt=conn.prepareStatement(sql);
    }
    
    // METODO PARA INSERTAR DATOS EN LAS COLUMNAS;
    public void setString(int i, String x) throws SQLException{
        pstmt.setString(i, x);
    }
    public void setInt(int i,int x) throws SQLException{
    pstmt.setInt(i, x);
    }
    public int executeUpdate() throws SQLException{
     return pstmt.executeUpdate();
    }
}