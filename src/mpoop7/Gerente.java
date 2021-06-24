
package mpoop7;
/**
 * Ejercicio de la Práctica
 * @author daniel
 */
public class Gerente extends Empleado{
    
    private float presupuesto;

    public Gerente() {
    }

    
    //Super constructor
    public Gerente(float presupuesto, String nombre, int numEmpleado, float sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    /*Funcion privada*/
    private void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    /*Funcion publica*/
    public void asignarPresupuesto(float presupuesto){
        setPresupuesto(presupuesto);
    }

    
    //Sobrecarga mismo nombre del metodo con los mismos parametros en una sola clase
    @Override
    public String toString() {
        return super.toString()+
                "Gerente{" + "presupuesto=" + presupuesto + '}';
    }
    
    
    
}
