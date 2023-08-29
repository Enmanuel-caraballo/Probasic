import java.util.Scanner;
public class Ejercicio_9 {
    static Scanner lector = new Scanner(System.in);
    static double total,iva= 1.19,precio;
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA CALCULAR IVA DE 19%");
        System.out.println("Ingrese el precio para calcular el iva");
        precio= lector.nextDouble();
        total=precio*iva;

        System.out.println("el total con el iva incluido es: "+total);
        
    }
    
}
