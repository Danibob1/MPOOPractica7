package actividad_extra3;
/**
 * Ejercicio exta 
 *
 * Uso de herencia a través de varias clases
 * haciendo jerarquia desde el mas alto hacia el mas bajo
 * @author daniel y carlos
 * @version 1.0 
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        
        Alumno_Ingenieria alumno= new Alumno_Ingenieria("Citcuitos 1", 317295931,true,"Daniel Prado",20, "Masculino"); 
        System.out.println(alumno);
        System.out.println("\n");
        Alumno_Ingenieria alumno2= new Alumno_Ingenieria("Citcuitos 2", 420055910 ,true,"Carlos Lujan",21, "Masculino"); 
        System.out.println(alumno2);
        
        System.out.println("\n");
        Profesor_Teoria profesor= new Profesor_Teoria(" I05 ",23,2.0f,"Erik Norman",35,"Masculino");
        System.out.println(profesor);
      
    } 
}
