import java.util.Scanner;
public class Ejercicio_2 {
    static Scanner lector = new Scanner(System.in);
    static String texto;
    public static void main(String[] args) {
        System.out.println("Ingrses un texto");
        texto = lector.nextLine();
        System.out.println(" El texto que usted ingrso es: "+texto);
        
    }
}
