
public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
    }
}

class Persona {

    //Atributos
    String nombre;

    //Constructor
    Persona(String nombre) {
        this.nombre = nombre;
        System.out.println("Impresion de this en la clase persona" + this);
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this);
    }
}

class Imprimir {

    //Metodo
    public void imprimir(Persona p) {
        System.out.println("Impresion del argumento persona" + p);
        System.out.println("Operador this" + this);
    }
}
