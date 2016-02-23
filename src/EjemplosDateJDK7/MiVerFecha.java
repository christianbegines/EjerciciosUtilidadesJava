package EjemplosDateJDK7;

import java.lang.*;
import java.util.*;
public class MiVerFecha{
	public static void main(String args[]){
		String diasS[] = {"domingo","lunes","martes","miercoles","jueves","viernes","sabado"};
		String mesA[] = {"enero","febrero","marzo", "abril","mayo","junio","julio",
                                 "agosto","septiembre","octubre","noviembre","diciembre"};
                
                //EL objeto Date almacena la fecha actual del sistema
		Date hoy = new Date();
                
                System.out.println("DATE --> " + hoy);
		GregorianCalendar calenG = new GregorianCalendar();
                
                //Asignamos la fecha de hoy al objeto GregorianCalendar
		calenG.setTime(hoy);
		
                System.out.print("\n Hoy es ");
		System.out.print(            diasS[calenG.get(Calendar.DAY_OF_WEEK)-1] );
                
		System.out.print(" "            + calenG.get(Calendar.DAY_OF_MONTH));
                
		System.out.print(" de "     + mesA[calenG.get(Calendar.MONTH)]);
                
		System.out.print(" de "         + calenG.get(Calendar.YEAR));
		System.out.print(", y son las " + calenG.get(Calendar.HOUR_OF_DAY));
		System.out.print(":"            + calenG.get(Calendar.MINUTE));
		System.out.println(":"          + calenG.get(Calendar.SECOND) );
                System.out.println();
	}
}
