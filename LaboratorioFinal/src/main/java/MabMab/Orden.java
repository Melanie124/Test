package MabMab;

public class Orden {

    private int idOrden;
    private Computadora computadoras[];
    private int contadorOrdenes;
    private int contadorComputadoras;
    private final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadoras) {
        if (contadorComputadoras < MAX_COMPUTADORAS){
            this.computadoras[contadorComputadoras++] = computadoras;
        }
    }

    public double calcularTotal() {
        double total;
        total = 1000 * contadorComputadoras;
        return total;
    }

    public void mostrarOrden() {
        for (int i=0;i<contadorComputadoras;i++){
            System.out.println("Computadora " +(i+1));
            System.out.println(computadoras[i]);
        }
    }
}
