import java.util.Scanner;

public class Ejercicio_39{
    static Scanner lector = new Scanner(System.in);
    static int edad,añoAct,añoNac;
    static double totalSleep;

    public static void main(String[] args) {
        System.out.println("Ingrese su año de nacimiento");
        añoNac=lector.nextInt();
        System.out.println("Ingrese el año actual");
        añoAct=lector.nextInt();
        edad=añoAct-añoNac;

        totalSleep=(edad*0.34);
        System.out.println("usted ha dormido durante toda su vida un tiempo aprox de: "+totalSleep+"años");

        
    }
}