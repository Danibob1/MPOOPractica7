package actividad_extra3;

/**
 *  Clase Profesor_Teoria con sus respectivos atributos y metodos
 *  con un super-constructor y sobrecarga del metodo toString
 *  @author daniel y carlos
 */

public class Profesor_Teoria extends Profesor{
    private String numSalon;

    public Profesor_Teoria(String numSalon, int numEmpleado, float suueldo, String nombre, int edad, String genero) {
        super(numEmpleado, suueldo, nombre, edad, genero);
        this.numSalon = numSalon;
    }

    public String getNumSalon() {
        return numSalon;
    }

    public void setNumSalon(String numSalon) {
        this.numSalon = numSalon;
    }
    
    public void usaTraje(){
    
    }

    @Override
    public String toString() {
        return super.toString()+"\nProfesor_Teoria{" + "numSalon=" + numSalon + '}';
    }
    
}
