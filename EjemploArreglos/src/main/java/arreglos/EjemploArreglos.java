package arreglos;

public class EjemploArreglos {

    public static void main(String[] args) {
        //Declarar
        int edades[];

        //Instanciar
        edades = new int[3];

        //Inicializar
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;

        //Imprimir
        System.out.println("arreglo 1: " + edades[0]);
        System.out.println("arreglo 2: " + edades[1]);
        System.out.println("arreglo 3: " + edades[2]);

        //Declarar e instanciar
        Persona personas[] = new Persona[4];

        //Inicilizar
        personas[0] = new Persona("Juan");
        personas[2] = new Persona("Karla");

        //Imprimir
        System.out.println("arreglo persona 0: " + personas[0]);
        System.out.println("arreglo persona 1: " + personas[1]);
        System.out.println("arreglo persona 2: " + personas[2]);
        System.out.println("arreglo persona 3: " + personas[3]);

        //Nuevo arreglo
        String nombres[] = {"Sara", "Laura", "Carlos", "Karla"};

        //Imprimir con bucles
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombres " + i + " " + nombres[i]);
        }
    }

}
