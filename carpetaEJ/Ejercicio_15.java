import java.util.Scanner;
public class Ejercicio_15 {
    static Scanner lector = new Scanner(System.in);
    static int anac,aac;
    static int edad;
    public static void main(String[] args) {
        
        System.out.println("Ingrese su año de nacimiento");
        anac=lector.nextInt();
        System.out.println("Ingrese el año actual");
        aac=lector.nextInt();
        edad=aac-anac;
        if(edad>=18){
            System.out.println(edad+ " años "+" Mayor de edad");

        }else{
            System.out.println(edad + " años "+" Menor de edad");
        }


    }
}
