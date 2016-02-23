/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazVotante;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daw1
 */
public class Padron implements GestionPadron {
    List<Persona> lista=new ArrayList();
    
    @Override
    public boolean darAlta(Persona p) {
       boolean resp=true;
       if(!lista.contains(p)){
           lista.add(p);
           
       }else resp=false;
       return resp;
    }
    
    @Override   
    public boolean darBaja(Persona p) {
       boolean resp=true;
       if(lista.contains(p)){
           lista.remove(p);
           
       }else resp=false;
       return resp;
    }
    

    @Override
    public List<Persona> buscar(boolean candidato) {
        Ciudadano c;
        List<Persona>buscados=new ArrayList();
        for(Persona p:lista){
          if(p instanceof Ciudadano){
              c=(Ciudadano)p;
              if(c.isCandidato()== candidato){
                  buscados.add(c);
              }
          }
      }
        return buscados;
    }

    @Override
    public List<Persona> buscar(int edad) {
        List<Persona>buscados=new ArrayList();
        for(Persona p:lista){
            if(p.anyos==edad){
                buscados.add(p);
            }
        }
        return buscados;
    }
    
    
}
