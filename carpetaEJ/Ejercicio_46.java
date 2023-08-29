import java.util.Scanner;

public class Ejercicio_46 {
    static Scanner lector=new Scanner(System.in);
    static double total, milla,metro=1852;

    public static void main(String[] args) {
        System.out.println("Ingrese la distancia en millas nauticas");
        milla=lector.nextDouble();
        total=milla*metro;
        System.out.println("El total en metros de las millas nauticas ingresadas es de: "+total+"Mt");


     
    }
}
