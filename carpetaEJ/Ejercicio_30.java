import java.util.Scanner;
public class Ejercicio_30 {
    static Scanner lector=new Scanner(System.in);
    static int km,mt;
    public static void main(String[] args) {
        System.out.println("Ingrese la distancia en kilometros");
        km=lector.nextInt();
        mt=km*1000;
        System.out.println("La distancia en metros es: "+mt+"mts");

    }
    
}
