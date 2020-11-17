
public class Caja {

    // Atributos
    int ancho;
    int alto;
    int profundo;

    public Caja() {
        // Constructor vacio
    }

    public Caja(int ancho, int alto, int profundo) {
        // Constructor con parametros
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    // Metodos
    public int Volumen() {
        return this.ancho * this.alto * this.profundo;
    }
}
