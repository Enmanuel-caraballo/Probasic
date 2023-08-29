import java.util.Scanner;

public class Ejercicio_42 {
    static Scanner lector = new Scanner(System.in);
    static double vtN, kv,naraN, pesoN=6,naranja=0.5,sistema=1.0,necesario,kgN;
    public static void main(String[] args) {
        System.out.println("Ingrese los Kilovoltios necesarios para realizar el trabajo");
        kv=lector.nextDouble();
        vtN=kv*1000;
        System.out.println("Usted necesitara un total de: "+vtN+" Vt");
        naraN=vtN*naranja;
        System.out.println("Usted necesitara un aproximado de: "+naraN+" Naranjas para hacer funcionar el sistema");
        
        necesario=pesoN*naraN;
        kgN=necesario/1000;
        System.out.println("Usted necesitara "+kgN+" KG de naranjas para hacer funcionar el sistema ");

        
    }
}
