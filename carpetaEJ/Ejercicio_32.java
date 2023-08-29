import java.util.Scanner;

public class Ejercicio_32 {
    static double aream2,areacm,aream,area,largo,ancho;
 static Scanner lector=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese el largo del rectangulo en metros");
        largo=lector.nextDouble();
        System.out.println("Ingreso ancho del rectangulo en metros");
        ancho=lector.nextDouble();
        area=largo*ancho;
        System.out.println("El area del triangulo en metros es: "+area+"mt");
        areacm=area*100;
        System.out.println("El area del rectangulo en centimetros es: "+areacm+"cm");
        aream=areacm*10;
        aream2=aream*aream;
        System.out.println("El area en milimetrsos cuadrados es: "+aream2+"mm");




        
    }
}
