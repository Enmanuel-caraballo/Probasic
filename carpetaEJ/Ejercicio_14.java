import java.util.Scanner;
public class Ejercicio_14 {
    static Scanner lector=new Scanner(System.in);
    static int suma,n1,n2,n3,n4;
    
    public static void main(String[] args) {
        System.out.println("Ingrese el numero 1");
        n1=lector.nextInt();
        System.out.println("Ingrese el numero 2"); 
        n2=lector.nextInt();
        System.out.println("Ingrese el numero 3");
        n3=lector.nextInt();
        System.out.println("Ingrese el numero 4");
        n4=lector.nextInt();

suma=n1+n2+n3+n4;
System.out.println("el total de la suma de los 4 numeros es: "+suma);
        
    }
}
