import java.util.Scanner;
public class Ejercicio_22 {
    static Scanner lector=new Scanner(System.in);
    static int parteEntera;
    static double parteDecimal,numeroReal;



    public static void main(String[] args) {
        System.out.println("Ingrese un nuero real");
        numeroReal=lector.nextDouble();

        parteEntera = (int) numeroReal;
        parteDecimal=numeroReal-parteEntera;

        System.out.println("parte entera "+parteEntera);
        System.out.println("parte decimal "+parteDecimal);
        
    }
    
}
