
public class PruebaPersonas {

    public static void main(String[] args) {
        
        //Creacion de un objeto de tipo persona
        Persona persona1;
        
        //Instanciando (Creando un objeto de la clase Persona)
        persona1 = new Persona();
        
        //Accedemos al objeto persona
        //Llamamos al metodo desplegarNombres
        persona1.desplegarNombres();
        
        //Modificamos los valores de los atributos Persona
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        
        //Nuevamente la impresion
        System.out.println("");
        persona1.desplegarNombres();
        
        //Creacion de un segundo objeto de tipo Persona
        Persona persona2 = new Persona();
        persona2.nombre = "Karla";
        persona2.apellido = "Gomez";
        
        System.out.println("");
        persona2.desplegarNombres();
        

    }
}
