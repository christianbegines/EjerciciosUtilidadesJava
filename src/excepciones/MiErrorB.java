/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author daw1
 */
public class MiErrorB extends RuntimeException {
    
    public MiErrorB(String mensaje) {
        super("color " + mensaje + " permitido");
    }
}
