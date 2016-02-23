
package excepciones;

public class Validar {

    public static void esValido(String color) {
        if (color.equals("rojo") || color.equals("verde")) {
            throw new MiError(color);
        }
        else 
           throw new MiErrorB(color); 
    }
}
