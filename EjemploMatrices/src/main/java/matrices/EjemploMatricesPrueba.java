package matrices;

public class EjemploMatricesPrueba {

    public static void main(String[] args) {
        //Declaramos
        int edades[][];

        //Instanciar
        edades = new int[3][2];

        //Instanciar los valores de la matriz
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;

        //Impresion
        System.out.println("Matriz 0-0: " + edades[0][0]);
        System.out.println("Matriz 2-0: " + edades[2][0]);

        //Declaracion e instanciacion
        Persona personas[][] = new Persona[1][2];

        //Inicializar
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");

        //Impresion de valores
        System.out.println("Matriz personas 0-0: " + personas[0][0]);
        System.out.println("Matriz personas 0-1: " + personas[0][1]);

        //Impresion a traves de ciclos
        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println("Matriz " + i + " - " + j + " : " + personas[i][j]);
            }
        }
    }
}
