
public class EjemploEstatico {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        System.out.println(persona);

        Persona persona2 = new Persona("karla");
        System.out.println(persona2);

        Persona persona3 = new Persona("Carlos");
        System.out.println(persona3);

        System.out.println("contador de personas: " + Persona.getContadorPersonas());

    }
}
