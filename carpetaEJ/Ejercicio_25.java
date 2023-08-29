import java.util.Scanner;
public class Ejercicio_25 {
    static Scanner lector=new Scanner(System.in);
    static double fahrenheit,centigrados;
    
    public static void main(String[] args) {
        System.out.println("Ingrese los grados °C para convertir a grados °F");
        centigrados=lector.nextDouble();
        fahrenheit=centigrados*1.8+32;
        System.out.println("La conversion a grado °F es: "+fahrenheit);
    }
    
}
