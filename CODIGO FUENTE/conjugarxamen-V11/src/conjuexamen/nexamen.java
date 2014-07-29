/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuexamen;

import java.util.ArrayList;


public class nexamen {
    private String tituloExamen;
    private int idexamen;

   
    private ArrayList<npregunta> preguntas;
    private ArrayList<npregunta> preguntasc; 
    
    public nexamen(String titulo){
        tituloExamen=titulo;
        preguntas = new ArrayList<npregunta>();
        preguntasc=new ArrayList<npregunta>();
    }
    
    public void agregarPregunta(String tituloPregunta){
        preguntas.add(new npregunta(tituloPregunta));
       
   }
   
    public ArrayList<npregunta> getPreguntas(){
        return preguntas;
    }

    public String getTituloExamen() {
        return tituloExamen;
    }

    public void setTituloExamen(String tituloExamen) {
        this.tituloExamen = tituloExamen;
    }
    
}
