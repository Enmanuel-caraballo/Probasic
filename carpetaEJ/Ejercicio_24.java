import java.util.Scanner;
public class Ejercicio_24 {
    static Scanner lector=new Scanner(System.in);
    static double pulgadas,total;
 
    public static void main(String[] args) {
        System.out.println("ingrese las pulgadas a convertir en centimetros");
        pulgadas=lector.nextDouble();

        total=pulgadas*2.54;
        System.out.println("LA conversion es: "+total+"cm");
        
        
    }
}
