import java.util.Scanner;

public class Ejercicio_48 {
    static Scanner lector = new Scanner(System.in);
    static double n1,n2,multiplicacion,suma,resta,division,resto;

    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros");
        n1=lector.nextDouble();
        n2=lector.nextDouble();
        suma=n1+n2;
        resta=n1-n2;
        multiplicacion=n1*n2;
        division=n1/n2;
        resto=n1%n2;
        System.out.println("la suma de los dos numeros es: "+suma);
        System.out.println("la resta de los numeros es: "+resta);
        System.out.println("la multiplicacionn de los numeros es: "+multiplicacion);
        System.out.println("la division de los numeros es: "+division);
        System.out.println("El resto de la division es: "+resto);
         
    }
    
}
