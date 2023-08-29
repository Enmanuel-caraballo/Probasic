import java.util.Scanner;
public class Ejercicio_18 {
    static Scanner lector = new Scanner(System.in);
    static int raiz,numero;

    public static void main(String[] args) {
        System.out.println("Ingreses el numero para cacular la raiz cuadrada");
        numero=lector.nextInt();
        raiz=numero*numero;
        System.out.println("La raiz cuadrada del numero "+numero+ " es " + raiz);
    }
    
}
