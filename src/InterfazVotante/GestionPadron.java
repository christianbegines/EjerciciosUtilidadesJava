/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazVotante;

import java.util.List;

/**
 *
 * @author daw1
 */
public interface GestionPadron {
    public boolean darAlta(Persona p);
    public List<Persona> buscar(boolean candidato);
    public List<Persona> buscar(int edad);
    public boolean darBaja (Persona p);
}
