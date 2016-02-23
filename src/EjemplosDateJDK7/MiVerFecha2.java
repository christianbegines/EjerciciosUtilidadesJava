package EjemplosDateJDK7;

import java.util.*;
import java.text.*;

public class MiVerFecha2 {

    public static void main(String args[]) {

        // El objeto Date almacena la fecha y hora del sistema
        Date hoy = new Date();

        //El objeto DateFormat coge el formato local
        DateFormat formateadorFecha = DateFormat.getDateInstance();

        //Se da formato a la fecha hoy
        String fechaLocal = formateadorFecha.format(hoy);
        System.out.println(fechaLocal);

        DateFormat formatF = DateFormat.getDateInstance(DateFormat.FULL);
        String fecha = formatF.format(hoy);
        System.out.println(fecha);
    }
}
