import java.util.Scanner;

public class Ejercicio_40 {
    static Scanner lector = new Scanner(System.in);
    static double totaPag,precioOZ,oz,kg,gr;
    
    
    
    
    public static void main(String[] args) {
        System.out.println("Ingrese el total en kilos del oro");
        kg=lector.nextInt();
        gr=kg*1000;
        totaPag=gr*228450;
        System.out.println("El total en gramos del oro es: "+gr+"gramos");
        oz=gr*0.03527396;
        System.out.println("El total en onzas de su oro es de: "+oz+"oz");
       
       
        System.out.println("El precio total de sus gramos de oro es de: "+totaPag);

        
    }
}
