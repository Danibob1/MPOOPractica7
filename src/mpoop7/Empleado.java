package mpoop7;
/**
 * Ejercicio de la Práctica
 * @author daniel
 */
public class Empleado {
    
    private String nombre;
    private int numEmpleado;
    private float sueldo;

    public Empleado() {
    }
    
    public Empleado(String nombre, int numEmpleado, float sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    
    public void aumentarSueldo(int porcentaje){
        sueldo= sueldo+(sueldo*porcentaje/100);
    }
    
    //Este es un metodo heraderado sobreescribieno mismo metodo mismos parametros
    @Override
    public String toString() {
        return super.toString()+
                " Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
     //Impime la direccion de memoria del objeto gerente del paquete mpoop7
    
    
}
