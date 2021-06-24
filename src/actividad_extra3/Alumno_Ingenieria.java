package actividad_extra3;
/**
 *  Clase Alumno_Ingenieria con sus respectivos atributos y metodos
 *  con un super-constructor y sobrecarga del metodo toString
 *  @author daniel y carlos
 */

public class Alumno_Ingenieria extends Alumno {
    
    private String circuito;
    
    public Alumno_Ingenieria(String circuito, int numCuenta, boolean tieneBeca, String nombre, int edad, String genero) {
        super(numCuenta, tieneBeca, nombre, edad, genero);
        this.circuito = circuito;
    }

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }
    
    public void calcular(){
 
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nAlumno_Ingenieria{" + "circuito=" + circuito + '}';
    }

}
