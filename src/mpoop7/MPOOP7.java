package mpoop7;
/**
 * Ejercicio de la Práctica
 * @author daniel
 */
public class MPOOP7 {
    
    public static void main(String[] args) {
              
        //Constructor vacio
        Gerente ger1= new Gerente();
        ger1.setNombre("Defa");
        ger1.setNumEmpleado(4363);
        ger1.setSueldo(15000);
        System.out.println(ger1);
        ger1.asignarPresupuesto(10000);
        System.out.println(ger1);
        System.out.println("Presupuesto: "+ger1.getPresupuesto() );
        System.out.println("\n");
        //Constructor con parametros
        Gerente ger2= new Gerente(50000, "Julieta", 15,30000);
        System.out.println(ger2);
        ger2.aumentarSueldo(10);
        System.out.println(ger2);
        System.out.println("\n");
        //Jerarquia de instancia a través de herencia del mas bajo al mas alto
        //intanceof palabra reservada que nos instancia
        //Relacion IS-A (es un) sirve en herencia y afirma si un objeto es de una clase en especifico 
        Gerente ger3= new Gerente();
        if(ger3 instanceof Gerente){
            System.out.println("Es una instancia de gerente");
        }if(ger3 instanceof Empleado){
            System.out.println("Si es una instancia del empleado");
        }else{
            System.out.println("NO es intancia de empleado");
        }if(ger3 instanceof Object){
            System.out.println("Si es una instancia de Objeto");
        }else{
            System.out.println("No es una instancia de Objeto");
        }
        
    }
}
