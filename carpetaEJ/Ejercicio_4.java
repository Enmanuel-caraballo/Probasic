import java.util.Scanner;
public class Ejercicio_4 {
    static Scanner lector=new Scanner(System.in);
    static double pi=3.14159265,area,radio;
    public static void main(String[] args) {
        System.out.println("**POGRAMA CALCULADOR DE AREA DE CIRCULOS**");
        System.out.println("Ingrese el radio del circulo");
       radio = lector.nextDouble();
        radio= radio*radio;
       area=radio*pi;
       System.out.println("El area de el circulo es: "+area);
        
    }
    
}
