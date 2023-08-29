import java.util.Scanner;

public class Ejercicio_34 {
    static int monto;
    static double descuento, total;
    static Scanner lector=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese el monto de la compra");
        monto=lector.nextInt();
        if(monto>=1000 && monto<5000){
            descuento=monto*0.1;
            total=monto-descuento;
            System.out.println("El total de la compra con el descuento del 10% es: "+total+"$");


        }else if(monto<=500)
        System.out.println("El total a pagar por la compra es: "+monto+"$");

        if(monto>=5000){
            descuento=monto*0.2;
            total=monto-descuento;
            System.out.println("El total de la compra con el descuento del 20% es: "+total+"$");

        }

        
    }
}
