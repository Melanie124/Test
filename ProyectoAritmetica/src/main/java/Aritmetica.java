
public class Aritmetica {

    //Atributos de la clase
    int a;
    int b;

    public Aritmetica() {
        System.out.println("Ejecutando constructor vacio");
    }

    public Aritmetica(int a, int b) {
        //This es necesario para apuntar al objeto
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando contructor con argumentos");
    }

    //Metodos
    public int sumar() {
        return this.a + this.b;
    }

    public int restar() {
        return this.a - this.b;
    }

    public int multiplicar() {
        return this.a * this.b;
    }

    public int dividir() {
        return this.a / this.b;
    }
}
