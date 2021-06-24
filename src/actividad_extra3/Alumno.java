package actividad_extra3;
/**
 * Clase Alumno con sus respectivos atributos y metodos
 * le va a heredar a la clase Alumno_Ingenieria y Alumno_Medicina 
 * con un super-constructor y sobrecarga del metodo toString
 * @author daniel y carlos
 */

public class Alumno extends Persona {

private int numCuenta;
private boolean tieneBeca;


    public Alumno(int numCuenta, boolean tieneBeca, String nombre, int edad, String genero) {
        super(nombre, edad, genero);
        this.numCuenta = numCuenta;
        this.tieneBeca = tieneBeca;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public boolean isTieneBeca() {
        return tieneBeca;
    }

    public void setTieneBeca(boolean tieneBeca) {
        this.tieneBeca = tieneBeca;
    }

    public void estudiar(){

    }

    @Override
    public String toString() {
        return super.toString()+ 
                "\nAlumno{" + "numCuenta=" + numCuenta + ","
                + " tieneBeca=" + tieneBeca + '}';
    }
      
}
