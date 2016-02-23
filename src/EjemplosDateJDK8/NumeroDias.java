package EjemplosDateJDK8;


import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NumeroDias{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos d�as tardar�s en terminar la revisión?");
		long nDias=Long.parseLong(sc.nextLine());
                
                
                
           // ********** LO MISMO EN JAVA 8 ***************************
                
                LocalDate hoy = LocalDate.now();
                
                LocalDate fechaRevision = hoy.plusDays(nDias);
                
                DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
                System.out.println("La revision se entregará el dia:" + formateador.format(fechaRevision));
                

	}
}
