
public class PalabraReturnClases {

    public static void main(String[] args) {

        Suma x = crearObjetoSuma();
        var resultado = x.sumar();
        System.out.println("resultado = " + resultado);

    }

    private static Suma crearObjetoSuma() {
        Suma suma = new Suma(4,6);
        return suma;
    }
}

class Suma {

    int a;
    int b;

    //Constructor
    public Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //Metodo
    public int sumar() {
        return (this.a + this.b);
    }

}
