
package actividadclasesalexrios66668;

public class Personas {
    
    private String nombre;
    private String tipo;
    private int edad;
    private char sexo;
    private int matricula;

    public Personas() {
    }

    public Personas(String nombre, String tipo, int edad, char sexo, int matricula) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.sexo = sexo;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Personas{" + "Nombre = " + nombre + ", Tipo = " + tipo + ", Edad = " + edad + ", Sexo = " + sexo + ", Matricula = " + matricula + '}';
    }
    
    
    
}
