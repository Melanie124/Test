package palabrafinal;
public class EjemploPalabraFinal {
    public static void main(String[] args) {
        //No se puede modificar por ser final
        //ClaseFinal.VAR_PRIMITIVO = 20;
        
        //No se puede modificar por ser final
        //ClaseFinal.VAR_PERSONA = new Persona();
        
        ClaseFinal.VAR_PERSONA.setNombre("Juan");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
        
        ClaseFinal.VAR_PERSONA.setNombre("Carlos");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
   
}
