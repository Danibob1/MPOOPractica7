package actividad_extra3;

/**
 *  Clase Profesor_Laboratorio con sus respectivos atributos y metodos
 *  con un super-constructor y sobrecarga del metodo toString
 *  @author daniel y carlos
 */

public class Profesor_Laboratorio extends Profesor {
    
    private String numLaboratorio;

    public Profesor_Laboratorio(String numLaboratorio, int numEmpleado, float suueldo, String nombre, int edad, String genero) {
        super(numEmpleado, suueldo, nombre, edad, genero);
        this.numLaboratorio = numLaboratorio;
    }

    public String getNumLaboratorio() {
        return numLaboratorio;
    }

    public void setNumLaboratorio(String numLaboratorio) {
        this.numLaboratorio = numLaboratorio;
    }
    
    public void usaBata(){
    
    }

    @Override
    public String toString() {
        return super.toString()+"\nProfesor_Laboratorio{" + "numLaboratorio=" + numLaboratorio + '}';
    }
    
    
}
