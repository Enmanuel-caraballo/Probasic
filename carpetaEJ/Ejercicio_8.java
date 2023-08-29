import java.util.Scanner;
public class Ejercicio_8 {
   static Scanner lector = new Scanner(System.in);
    static int num,numD;
    static int resto, resultado;
    public static void main(String[] args) {
        System.out.println("ingrese el numero a dividir");
        num=lector.nextInt();
        System.out.println("Ingrese el divisor");
        numD=lector.nextInt();
        resultado=num/numD;
        resto=num%numD;
        System.out.println("El resultado de la division es: "+resultado);
        System.out.println("El resto de la division es: "+ resto);


    }
}
