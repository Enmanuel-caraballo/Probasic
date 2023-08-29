import java.util.Scanner;
public class Ejercicio_5 {
    static Scanner lector=new Scanner(System.in);
    static double area,diagonal1,diagonal2;

    public static void main(String[] args) {
System.out.println("**PROGRAMA CALCULADOR DE AREAS DE ROMBOS**");
System.out.println("Ingrese la diagonal Mayor");
diagonal1 = lector.nextDouble();
System.out.println("Ingrese la diagonal menor ");
diagonal2= lector.nextDouble();
area=(diagonal1*diagonal2)/2;
System.out.println("El area de su circulo es: "+area);

        
    }
}
