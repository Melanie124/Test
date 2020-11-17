
public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;

    //Constructores
    private Persona() {
        // super() se manda a llamar de manera automatica
        this.idPersona = ++contadorPersonas;
    }

    //Constructor sobrecargado
    public Persona(String nombre, int edad) {
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    //Metodos
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

}
