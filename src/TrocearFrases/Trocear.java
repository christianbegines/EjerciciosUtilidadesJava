package TrocearFrases;

import java.util.StringTokenizer;

public class Trocear {

    public static void main(String[] args) {
        String text; 
        
        text="this is a test.Probamos separador.Y lo separamos";
//        StringTokenizer st = new StringTokenizer(text, ".");
//        
//        while (st.hasMoreTokens()) {
//            System.out.println(st.nextToken());
//           
//        }
        int i=0;
        String[] trozos =text.split("\\.");
        for(String t: trozos){
            System.out.println(t);
            i++;
        }
        System.out.println(i);
    }

}
