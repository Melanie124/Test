package MundoPC;

import MabMab.*;

public class MundoPC {

    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("Monitor tipo 1", 22);
        Teclado teclado1 = new Teclado("USB C", "sin marca");
        Raton raton1 = new Raton("USB C", "sin marca");
        Computadora computadora1 = new Computadora("Tipo 1", monitor1, teclado1, raton1);

        Monitor monitor2 = new Monitor("Monitor tipo 2", 15);
        Teclado teclado2 = new Teclado("usb", "Dell");
        Raton raton2 = new Raton("usb", "Dell");
        Computadora computadora2 = new Computadora("Tipo 2", monitor2, teclado2, raton2);

        Computadora computadora3 = new Computadora("Tipo 3", monitor2, teclado1, raton1);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.agregarComputadora(computadora3);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadora2);
        orden2.agregarComputadora(computadora3);
        orden2.mostrarOrden();

    }

}
