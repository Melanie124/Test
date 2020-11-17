package ventas;

import MabMab.*;

public class Ventas {

    public static void main(String[] args) {
        //Crear objetos de tipo de producto
        Producto producto1 = new Producto("Camisa", 50);
        Producto producto2 = new Producto("Pantalon", 100);

        //Creamos ordenes
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);

        orden1.mostrarOrden();
    }
}
