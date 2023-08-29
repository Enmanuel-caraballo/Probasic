import java.util.Scanner;

public class Ejercicio_31 {
static double areaml,areacm,areac,aream,baseml,alturaml;
static double aml,bml,bcm,bm;//bml=base milimetros,bcm= base centimetros,bm=base metros
 static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite la base del triangulo en milimitros ");
        bml=lector.nextDouble();
        System.out.println("Digite la altura del triangulo en milimetros");
        aml=lector.nextDouble();
        areaml=(bml*aml)/2;
        System.out.println("El area del triangulo en Milimetros es: "+areaml+"mm");
        areacm=areaml/10;
        System.out.println("El area en cm es: "+areacm+"cm");
        aream=areacm*1/100;
        areac=aream*aream;
        System.out.println("El area del triangulo en metros cuadrados cuadrado es: "+areac);






    }
    
}
