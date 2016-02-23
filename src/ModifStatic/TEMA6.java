
package ModifStatic;

public class TEMA6 {
  
    public static void main(String[] args) {
        Coche c1 = new Coche();
        Coche c2 = new Coche();
        
        System.out.println("Total de coches: " + Coche.getTotal_coches());
        System.out.println("Nº serie c1: " + c1.getNum_serie());
        System.out.println("Nº serie c2: " + c2.getNum_serie());

        Coche c3 = new Coche();

        System.out.println("Total de coches: " + Coche.getTotal_coches());
        System.out.println("Nº serie c3: " + c3.getNum_serie());

        System.out.println("suma= " + Matematicas.sumar(3.0, 2.0));
        System.out.println("restar= " + Matematicas.restar(6.0, 3.0));

    }

}
