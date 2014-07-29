/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuexamen;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * clase con metodos para la coneccion y la
 * insercion de codigo sql
 * @author hp
 */
public class SQLQuery {
    /** Almacena la coneccion*/
    protected Connection conn;
    /** gestiona las consultas sql*/
    protected Statement stmt;
    /** gestiona las consultas y protege de iyeccion sql*/
    protected PreparedStatement pstmt;
    /** gestiona los datos*/
    protected ResultSet rs;
    /**
     * contructor por defecto de la clase
     */
    public SQLQuery(){
    
    }
    /**
     * pemite realizar una coneccion con la Base de Datos
     * @param BD Es el nombre de la base de datos a la que nos queremos conectar
     * @throws ClassNotFoundException Cuando no se puede activar el driver
     * @throws SQLException Cuando no se realiza la coneccion
     */
    public void conectar(String BD) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost/"+BD,"root","");

    }
    public Connection conectar1(String BD) throws ClassNotFoundException, SQLException{
     Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost/"+BD,"root","");   
        return conn;
    }
    /**
     * Desconecta la coneccion y el PreparedStatement
     */
    public void desconectar() throws SQLException{
        conn.close();
        rs.close();
    }
    /**
     * Desconecta la coneccion, el PreparedStatement, ResultSet
     * @param rs Result set que deseamos cerrar
     * @throws SQLException Error al intentar cerrar los objetos de SQL
     */
    public void desconectar(ResultSet rs) throws SQLException{
        desconectar();
        rs.close();
    }
}