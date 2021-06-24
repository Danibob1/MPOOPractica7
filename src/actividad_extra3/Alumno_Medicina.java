package actividad_extra3;

/**
 *   Clase Alumno_Medicina  con sus respectivos atributos y metodos
 *  con un super-constructor y sobrecarga del metodo toString
 *  @author daniel y carlos
 */
public class Alumno_Medicina extends Alumno{
    
    private String instrumento;

    public Alumno_Medicina(String instrumento, int numCuenta, boolean tieneBeca, String nombre, int edad, String genero) {
        super(numCuenta, tieneBeca, nombre, edad, genero);
        this.instrumento = instrumento;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }
    
    
    public void curar(){
   
    }

    @Override
    public String toString() {
        return super.toString()+"\nAlumno_Medicina{" + "instrumento=" + instrumento + '}';
    }
    
    
}
