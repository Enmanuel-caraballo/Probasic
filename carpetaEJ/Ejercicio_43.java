import java.util.Scanner;


public class Ejercicio_43 {
    static int n1,n2;
    static Scanner lector = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros enteros");
        n1=lector.nextInt();
        n2=lector.nextInt();
        if(n1>n2){
            System.out.println("El numero mayor es "+n1);

        }else{
            System.out.println("El numero mayor es: "+n2);
        }
        
    }
}
