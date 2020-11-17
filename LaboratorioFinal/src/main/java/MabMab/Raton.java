package MabMab;

public class Raton extends DispositivoEntrada {

    private int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String nombre) {
        super(tipoEntrada, nombre);
        this.idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", contadorRatones=" + contadorRatones + '}';
    }

}
