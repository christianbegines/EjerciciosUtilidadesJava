package ModifStatic;

public class Coche {

    private String matricula;
    private String modelo;
    private int num_serie;
    private static int total_coches;

    public Coche() {
        total_coches++; //sirve como contador de numero de objetos creados de coche

        num_serie = total_coches;
    }

  // METODO STATIC PARA DEVOLVER ATRIBUTO STATIC
    public static int getTotal_coches() {
        return total_coches;
    }

   

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

}
