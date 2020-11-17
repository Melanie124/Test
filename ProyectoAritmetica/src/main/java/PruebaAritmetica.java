
public class PruebaAritmetica {

    public static void main(String[] args) {

        //Variables locales
        int operandoA = 6;
        int operandoB = 2;

        //Creamos un objeto de la clase arimetica con arg.
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);

        //Imprimir los valors de los operandos;
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);

        //Imprimimos resultados de la suma
        System.out.println("\nResultado suma = " + objeto1.sumar());

        //Imprimimos resultados de la resta
        System.out.println("\nResultado resta = " + objeto1.restar());

        //Imprimimos resultados de la multiplicacion
        System.out.println("\nResultado multiplicacion = " + objeto1.multiplicar());

        //Imprimimos resultados de la division
        System.out.println("\nResultado division = " + objeto1.dividir());
    }

//    public void otroMetodo(){
//        System.out.println(operandoA);
//    } 
}
