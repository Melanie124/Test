
public class PruebaCaja {

    public static void main(String[] args) {
        Caja nuevaCaja = new Caja();
        nuevaCaja.ancho = 3;
        nuevaCaja.alto = 2;
        nuevaCaja.profundo = 6;

        System.out.println("Volumen = " + nuevaCaja.Volumen());
    }
}
