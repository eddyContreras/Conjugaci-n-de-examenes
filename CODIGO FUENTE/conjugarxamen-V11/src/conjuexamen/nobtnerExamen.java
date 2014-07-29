/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuexamen;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author logan
 */

import java.sql.*;
import java.util.Random;
public class nobtnerExamen {
    
    private ArrayList<nexamen> examenes; 
    private ArrayList<nexamen> exaconjugado;
    private servicios servicio;
    private int aleatotorio;
    
    
    
    private String bd;
    private String nombreTabla;
    private String tituloExamen;
    
    private ArrayList<String> listaExamen;
    
    
    private ResultSet rs;
   public nobtnerExamen(){
   bd="conjugarexamen";
   nombreTabla="nexamen";
   
   servicio=new servicios();
   aleatotorio=0;
   examenes=new ArrayList<>();
   listaExamen=new ArrayList<>();
 
   }
   
   
   public void listexamencolumna(){
        listaExamen=new ArrayList<>();
        try {
            servicio.conectar(bd);
           rs= servicio.getColumna(nombreTabla);
            while(rs.next()){
           listaExamen.add(rs.getString("tituloexamen"));
           } 
            
           servicio.desconectar();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(nobtnerExamen.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }
   public ArrayList cargarexamen(){
            String tiexa,tipre;
            int n=0;
            
           listexamencolumna();
           try {
               for(int i=0;i<listaExamen.size();i++){
               
                   
               servicio.conectar(bd);
               rs=servicio.getconsulta("SELECT * FROM nexamen WHERE tituloexamen = '"+listaExamen.get(i)+"'");
              
               examenes.add(new nexamen(listaExamen.get(i)));
               while(rs.next()){
                
               // tiexa=rs.getString("tituloexamen");
               // examenes.add(new nexamen(tiexa));
                 tipre=rs.getString("titulopregunta");
                examenes.get(i).agregarPregunta(tipre);
                examenes.get(i).getPreguntas().get(n).setCalt(rs.getInt("respclave"));
                examenes.get(i).getPreguntas().get(n).setId(rs.getInt("idexamen"));
                examenes.get(i).getPreguntas().get(n).agregarAlternativa(rs.getString("altera"));
                examenes.get(i).getPreguntas().get(n).agregarAlternativa(rs.getString("alterb"));
                examenes.get(i).getPreguntas().get(n).agregarAlternativa(rs.getString("alterc"));
                examenes.get(i).getPreguntas().get(n).agregarAlternativa(rs.getString("alterd"));
                examenes.get(i).getPreguntas().get(n).agregarAlternativa(rs.getString("altere")); 
                n++;
               }
               n=0;
               
               servicio.desconectar(rs);
               }
           } catch (   ClassNotFoundException | SQLException ex) {
               Logger.getLogger(nobtnerExamen.class.getName()).log(Level.SEVERE, null, ex);
           }
           
     
       return examenes;
   }
   
   

}
