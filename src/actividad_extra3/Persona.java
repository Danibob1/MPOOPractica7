package actividad_extra3;
/**
 *  Clase Persona con sus respectivos atributos y metodos
 *  le va a heredar a la clase Alumno y Profesor
 *  @author daniel y carlos
 */
public class Persona {
    
private String nombre;
private int edad;
private String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void Hablar(){
        System.out.println("Estoy hablando");
    }    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + '}';
    }
   
}
