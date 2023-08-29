import java.util.Scanner;

public class Ejercicio_47 {
    static Scanner lector = new Scanner(System.in);
    static int cantidad;
    static double porcentaje=0.2,total,total1,pago,precio,total2;
    static String nombre;
    
    public static void main(String[] args) {
       System.out.println("Ingrese el nombre del producto"); 
       nombre=lector.next();
       System.out.println("Ingresese el precio del producto");
       precio=lector.nextDouble();
       System.out.println("ingrese el pago del cliente");
       pago=lector.nextDouble();

       total1=precio-pago;
       
       if(pago>precio){
        System.out.println("Debe dar un cambio de: "+total1);

       }else if(pago==precio){
     
        
        System.out.println("No debe dar cambio ");
       }
       if(pago<precio){
        System.out.println("Hay un deficict en el pago de la compra de: "+total1);
        
       }
     

        
    }
}
