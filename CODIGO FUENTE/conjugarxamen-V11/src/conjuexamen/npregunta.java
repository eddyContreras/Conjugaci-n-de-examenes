/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuexamen;

import java.util.ArrayList;

/**
 *
 * @author logan
 */
public class npregunta {
    private String tituloPregunta;
    private ArrayList<nalternativa> alternativas;
    private int calt;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public npregunta(String titulo){
        tituloPregunta =titulo;
        alternativas =new ArrayList<nalternativa>();
    }
    
    public void agregarAlternativa(String tituloAlternativa){
        alternativas.add(new nalternativa(tituloAlternativa));
    }
    public ArrayList<nalternativa> getAlternativas(){
        return alternativas;
    }

    public String getTituloPregunta() {
        return tituloPregunta;
    }

    public void setTituloPregunta(String tituloPregunta) {
        this.tituloPregunta = tituloPregunta;
    }

    public int getCalt() {
        return calt;
    }

    public void setCalt(int calt) {
        this.calt = calt;
    }
    
    
}
