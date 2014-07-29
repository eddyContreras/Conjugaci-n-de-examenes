/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuexamen;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mi
 */


public class nConjugar {
    private nobtnerExamen obtnerexamen;
    private ArrayList<nexamen> examenes;
  
    
    public nConjugar(){
    
    obtnerexamen=new nobtnerExamen();
    examenes=new ArrayList<>();
    }
   
    
   
    
    public ArrayList conjugar(){
    examenes=obtnerexamen.cargarexamen();
    String alternativaAleatoria;
    String alternativaClave;
    
    int aleatorio=0;
    int clave;
    for(int contador=0;contador<examenes.get(0).getPreguntas().size();contador++){
    
        aleatorio=aleatorio();
    
    clave=examenes.get(0).getPreguntas().get(contador).getCalt();
    
    alternativaAleatoria=examenes.get(0).getPreguntas().get(contador).getAlternativas().get(aleatorio).getTituloAlternativa();
    
    alternativaClave=examenes.get(0).getPreguntas().get(0).getAlternativas().get(clave).getTituloAlternativa();  
    
    examenes.get(0).getPreguntas().get(contador).getAlternativas().get(clave).setTituloAlternativa(alternativaAleatoria);
    examenes.get(0).getPreguntas().get(contador).getAlternativas().get(aleatorio).setTituloAlternativa(alternativaClave);
   
    }
    return examenes;
    }
    
    public int aleatorio(){
        int ale;
    Random rn=new Random();
    ale=1+rn.nextInt(5);
    return ale-1;
    }
    
    
}
