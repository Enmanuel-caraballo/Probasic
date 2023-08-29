import java.util.Scanner;
public class Ejercicio_11 {
    static Scanner lector = new Scanner(System.in);
    static double area,largo,ancho;
    public static void main(String[] args) {
        System.out.println(" ingrese el largo del rectangulo");
        largo=lector.nextDouble();
        System.out.println("ingrese el ancho del rectangulo");
        ancho=lector.nextDouble();
        area=largo*ancho;
        System.out.println("El area de su recteangulo es: "+area);
        

        
    }
}
