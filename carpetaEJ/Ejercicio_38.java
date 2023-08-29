import java.util.Scanner;

public class Ejercicio_38 {
    static Scanner lector= new Scanner(System.in);
    static int manzana,consumo,consumoM,kg, años;
    static double pesoM=0.4;

    public static void main(String[] args) {
        System.out.println("Ingrese su edad");
        años=lector.nextInt();
        System.out.println("Ingrese los KG de frutas consumidos por año");
        kg=lector.nextInt();
        consumo=años*kg;
        System.out.println("Usted ha consumido un total de: "+consumo+"kg de frutas");
        System.out.println("Ingrese cuantas manzanas anuales aprox cree haber consumido");
        manzana=lector.nextInt();
        consumoM=(int) (manzana*pesoM*años);
        System.out.println("Usted consumio un promedio de "+consumoM +"kg de manzanas ");




        



        

    }
    
}
