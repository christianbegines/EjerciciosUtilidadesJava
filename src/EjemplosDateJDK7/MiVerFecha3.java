package EjemplosDateJDK7;

import java.util.*;
import java.text.*;
public class MiVerFecha3{
    public static void main(String args[]){
	Date hoy = new Date();
                        
        System.out.println("\n FECHA CON FORMATO AMERICANO");
        
        DateFormat formateador = DateFormat.getDateInstance( DateFormat.SHORT, Locale.US);
        String fechaL = formateador.format(hoy);
        System.out.println("Fecha corta: "+fechaL);
        
        formateador = DateFormat.getDateInstance( DateFormat.MEDIUM, Locale.US);
        fechaL = formateador.format(hoy);
        System.out.println("Fecha media: "+fechaL);
        
        formateador = DateFormat.getDateInstance( DateFormat.LONG, Locale.US);
        fechaL = formateador.format(hoy);
        System.out.println("Fecha larga: "+fechaL);
        
        formateador = DateFormat.getDateInstance( DateFormat.FULL, Locale.US);
        fechaL = formateador.format(hoy);
        System.out.println("Fecha completa: "+fechaL);
        
        
        
        System.out.println("\n FECHA CON FORMATO ESPA�OL");
        Locale fEsp=new Locale( "es", "ES","Traditional_WIN");
        
        fechaL = DateFormat.getDateInstance( DateFormat.SHORT, fEsp).format(hoy);
        System.out.println("Fecha corta: "+fechaL);
        
        fechaL= DateFormat.getDateInstance( DateFormat.MEDIUM, fEsp).format(hoy);
        System.out.println("Fecha media: "+fechaL);
        
        fechaL= DateFormat.getDateInstance( DateFormat.LONG, fEsp).format(hoy);
        System.out.println("Fecha larga: "+fechaL);
        
        fechaL = DateFormat.getDateInstance( DateFormat.FULL, fEsp).format(hoy);
        System.out.println("Fecha completa: "+fechaL);
        
        
        DateFormat formato = new SimpleDateFormat("EEE .d MMMM .yyyy", fEsp);
        fechaL = formato.format(hoy);
        System.out.println("\n FECHA CON FORMATO LIBRE: "+ fechaL + "\n");
        
        
        
        
	}
}
