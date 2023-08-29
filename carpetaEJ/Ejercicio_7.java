import java.util.Scanner;
public class Ejercicio_7 {
    static Scanner lector = new Scanner(System.in);
    static int op,numero;
    public static void main(String[] args) {
        do{
        System.out.println("Ingerese un numero entero");
        numero=lector.nextInt();
        if(numero>=0){
            System.out.println("el numero: "+numero+" es un numero positivo");
        }else{
             System.out.println("el numero: "+numero+" es un numero negativo");
        }
        System.out.println("¿Desea ingresar otro numero? 1(si) 2(no)");
        op=lector.nextInt();
     }while(op==1);
    }
}