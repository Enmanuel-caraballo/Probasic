import java.util.Scanner;
public class Ejercicio_16 {
    static Scanner lector= new Scanner(System.in);
    static double puntaje;
    
    public static void main(String[] args) {
        System.out.println("Ingrese el puntaje obtenido");
        puntaje = lector.nextDouble();
        if(puntaje<3){
            System.out.println("usted ha reprobado con una nota de: "+puntaje);
            
        }
else{
    System.out.println("usted ha aprbado la materia con una nota de: "+puntaje);
}
        
    }
}
