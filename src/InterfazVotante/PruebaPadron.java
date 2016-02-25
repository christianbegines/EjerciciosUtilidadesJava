/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazVotante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author daw1
 */
public class PruebaPadron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear padron
        Padron padron=new Padron();
        
        //cremos ciudadanos
        Ciudadano p1= new Ciudadano();
        Ciudadano p2= new Ciudadano();
        Ciudadano p3= new Ciudadano();
        Persona p4=new Ciudadano();
        Persona p5=new Ciudadano();
        
        //dar valores a los ciudadanos
        p2.setNombre("Juan");
        p2.setApellido("Martinez");
        p2.setAnyos(21);
        p2.setDni("22222222-f");
        p2.setCandidato(true);
        p2.setCiudad("Valencia");
        System.out.println(p2.datos());
        
        p1.setNombre("Pepe");
        p1.setApellido("Martinez");
        p1.setAnyos(17);
        p1.setDni("33333-g");
        p1.setCandidato(true);
        p1.setCiudad("Valencia");
        System.out.println(p1.datos());
        
        p3.setNombre("Jose");
        p3.setApellido("Martinez");
        p3.setAnyos(40);
        p3.setDni("1111111-h");
        p3.setCandidato(false);
        p3.setCiudad("Valencia");
        System.out.println(p3.datos());
        
        //damos de alta
        boolean resultado;
        resultado=padron.darAlta(p3);
        System.out.println(resultado);
        resultado=padron.darAlta(p1);
        System.out.println(resultado);
        resultado=padron.darAlta(p2);
        System.out.println(resultado);
        
      
      
        
        //buscamos por si es candidato
       
//        System.out.println(padron.buscar(true));
//        System.out.println(padron.buscar(40));
//        System.out.println(padron.darBaja(p3));
//        System.out.println(padron.darBaja(p2));
//        System.out.println(padron.buscar(true));
        
 
        
        
        //personas para odenar
        
       Collections.sort(padron.lista,new Comparador());
        System.out.println(padron.lista);
        
    }
    
}
