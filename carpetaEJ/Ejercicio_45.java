import java.util.Scanner;

public class Ejercicio_45 {
static Scanner lector = new Scanner(System.in);
static double real;
    public static void main(String[] args) {
        System.out.println("Ingrese un numero real (positivo) o (negativo)");
        real=lector.nextDouble();
        if(real>0){
            System.out.println("1");


        }else if(real<0){
            System.out.println("-1");
        }
        if(real==0){
            System.out.println("0");
        }

    }
    
}
