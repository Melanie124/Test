
public class PalabraNull {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1.obtenerNombre());
        Persona persona2 = persona1;
        System.out.println("persona2 = " + persona2.obtenerNombre());
        persona1 = null;
        if (persona1 != null) {
            System.out.println("persona1 = " + persona1.obtenerNombre());
        } else {
            System.out.println("No existen datos");
        }
    }
}

class Persona {

    String nombre;

    //Constructor
    Persona(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    public String obtenerNombre() {
        return this.nombre;
    }
}
