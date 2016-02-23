
package excepciones;

public class MiError extends RuntimeException {

   

    public MiError(String mensaje) {
        super("color " + mensaje + " no permitido");
    }
}
