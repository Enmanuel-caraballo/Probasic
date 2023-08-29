import java.util.Scanner;
public class Ejercicio_10{
    static Scanner lector=new Scanner(System.in);
    static double area,base,altura;
    public static void main(String[] args) {
        System.out.println("**PROGRAMA CALCULADOR DE AREAS DE TRIANGULOS**");
        System.out.println("Ingrese la base del triangulo");
         base=lector.nextDouble(); 
        System.out.println("Ingrese la altura del triangulo");
        altura=lector.nextDouble();
        area=(base*altura)/2;
        System.out.println("El area de su triangulo es: "+ area);

    }
    
}
