/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazVotante;

import java.util.Comparator;

/**
 *
 * @author daw1
 */
public class Comparador implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
         return p1.anyos - p2.anyos;
         
    }
    
}
