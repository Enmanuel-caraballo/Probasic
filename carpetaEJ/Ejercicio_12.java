import java.util.Scanner;
public class Ejercicio_12 {
    static Scanner lector = new Scanner(System.in);
    static int n,numero1,numero2,numero3,X1,x2,cuadrado;
    static double promedio,suma;
    public static void main(String[] args) {
        System.out.println("Digite tres numeros ");
        numero1=lector.nextInt();
        n++;
        numero2=lector.nextInt();
        n++;
        numero3=lector.nextInt();
        n++;
        promedio=(numero1+numero2+numero3)/n;
        suma=numero1+numero2+numero3;
        X1=numero1*2;
        x2=numero2*3;
        cuadrado=numero3*numero3;

        System.out.println("el promedio es: "+promedio);
        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("El doble del numero "+numero1+" es: "+X1+ " el triple del numero "+numero2 + " es "+x2 );
        System.out.println("El cuadrado del numero "+numero3+ " es "+ cuadrado);

    }
    
}
