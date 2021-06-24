package actividad_extra3;

/**
 *  Clase Profesor con sus respectivos atributos y metodos
 *  le va a heredar a la clase Profesor_Laboratorio y Profesor_Teoria
 *  con un super-constructor y sobrecarga del metodo toString
 *  @author daniel y carlos
 */

public class Profesor extends Persona {
   
private int numEmpleado;
private float suueldo;

    public Profesor(int numEmpleado, float suueldo, String nombre, int edad, String genero) {
        super(nombre, edad, genero);
        this.numEmpleado = numEmpleado;
        this.suueldo = suueldo;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public float getSuueldo() {
        return suueldo;
    }

    public void setSuueldo(float suueldo) {
        this.suueldo = suueldo;
    }
    
    public void calificar(){

    }

    @Override
    public String toString() {
        return super.toString()+"\nProfesor{" + "numEmpleado=" + numEmpleado + ", suueldo= $" + suueldo + '}';
    }
    
}
