import java.util.Scanner;

public class Ejercicio_41 {
    static Scanner lector =  new  Scanner(System.in);
    static int edad;
    static double cabellera,total,cabello=0.02;
     
    
    public static void main(String[] args) {
        System.out.println("Ingrese su edad ");
        edad = lector.nextInt();
        total=edad*12;
        cabellera=total*cabello;

        System.out.println("La longitud de su cabellera es: "+cabellera+" Mt");

        
    }
}
