/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosDateJDK7;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class ParseFecha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce fecha(02-feb-2015): ");
        String fecha = sc.nextLine();

        DateFormat formato = DateFormat.getDateInstance();
       
        Date f;
        try {
            f = formato.parse(fecha);
            System.out.println("FECHA ESCRITA: " + f);

        } catch (ParseException ex) {
            System.out.println(ex.getMessage() );
        }
    }

}
