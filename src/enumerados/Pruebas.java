package enumerados;

//import enumerados.Clase1.EstadoTanque;

public class Pruebas {

    public static void main(String[] args) {
        ColorSemaforo color = ColorSemaforo.ROJO;

        if (color == ColorSemaforo.VERDE) {
            System.out.println("PASE semaforo"+color);
        } else {
            System.out.println("VES FRENANDO semaforo rojo o ambar");
        }

        ColorSemaforo[] valores = ColorSemaforo.values();

        for (ColorSemaforo c : valores) {
            System.out.println(c);
        }

       
        Clase1.EstadoTanque e2 = Clase1.EstadoTanque.VACIO;

        //Para poder usar EstadoTanque directamente se necesita:
        // import enumerados.Clase1.EstadoTanque;
//         EstadoTanque e1 = EstadoTanque.VACIO;
    }

}
