
public class Empleado extends Persona {

    private int idEmplado;
    private double sueldo;
    private static int contadorEmpleado;

    //Constructor
    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmplado = ++contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmplado() {
        return idEmplado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "idEmplado=" + idEmplado + ", sueldo=" + sueldo + '}';
    }
}
