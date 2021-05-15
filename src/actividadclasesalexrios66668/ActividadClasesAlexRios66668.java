
package actividadclasesalexrios66668;

import java.util.Scanner;

public class ActividadClasesAlexRios66668 {
    
    public static void Personas() {
        
        //Métedo uno
        
        Personas Alex = new Personas( );
        Alex.setNombre("Alex Ríos");
        Alex.setTipo("Alumo");
        Alex.setEdad(19);
        Alex.setSexo('M');
        Alex.setMatricula(66668);
        
        System.out.println(Alex.toString());
        
        //Método dos
        
       Personas Darean = new Personas ("Darean Camara", "Alumno", 19,'F', 66669 );
       System.out.println(Darean.toString());
        
    }
    
    public static void Edificio() {
        
        Edificio A = new Edificio ("V", "Facultad de Ingeniería", 24060, "Luis");
        System.out.println(A.toString());
        
    }

    public static void main(String[] args) {
        
        
        System.out.println("Escribe personas o edificio, o si gustas las dos opciones pon ambas");
       String p1 = "";
       Scanner tc = new Scanner (System.in);
       p1 = tc.nextLine( );
       
        switch (p1) {
            case "Persona":
            case "persona":
                Personas ( );
                break;
                
            case "Edificio":
            case "edificio":
                Edificio ( );
                break;
                
            case "Ambas":
            case "ambas":
                Personas ( );
                Edificio ( );
                break;
                
            default:
                System.out.println("Palabra no registrada, intenta otra vez");
        }
        
        
    }
    
}
