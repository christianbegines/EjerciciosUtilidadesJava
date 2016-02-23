package excepciones;

import java.util.Scanner;

public class Test {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String colorCoche;

        System.out.println("Dime un color para el coche");
        colorCoche = sc.next();

        try {
            Validar.esValido(colorCoche);
        } catch (MiError e) {
            System.out.println(e.getMessage());
        } catch (MiErrorB e) {
            System.out.println(e.getMessage());
        }
    }
}
