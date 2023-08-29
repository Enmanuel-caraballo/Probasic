import java.util.Scanner;
public class Ejercicio_17 {
    static Scanner lector=new Scanner(System.in);
    static int numero1,numero2;
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros");
        numero1=lector.nextInt();
        numero2=lector.nextInt();
        if(numero1>numero2){
            System.out.println("El numero mayor es: "+numero1);


        }else{
            System.out.println("El numero mayor es: "+numero2);
        }

        
    }
}
