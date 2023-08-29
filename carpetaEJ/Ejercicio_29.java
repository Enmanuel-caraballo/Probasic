import java.util.Scanner;
public class Ejercicio_29 {
    static Scanner lector=new Scanner(System.in);
    static double cubo,numero;



    public static void main(String[] args) {
        System.out.println("Ingrese un numero para calcular el cubo");
        numero=lector.nextDouble();
        cubo=numero*numero*numero;
        System.out.println("El cubo de el numero: "+numero+" es: "+cubo);

        
    }
    
}
