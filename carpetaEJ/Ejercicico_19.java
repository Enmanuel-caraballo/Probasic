import java.util.Scanner;
public class Ejercicico_19 {
    static double pago,totalG,descuento=0.2,total,totalpxh,sueldo,hora,phora;
    
    
    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese el monto total de su sueldo");
        sueldo = lector.nextDouble();
        System.out.println("Ingrese el total de las horas extras");
        hora=lector.nextInt();
        System.out.println("Ingrese el pago por hora Extra");
        phora=lector.nextDouble();
        
        totalpxh=hora*phora;
        total=totalpxh+sueldo;
        
        descuento=total*descuento;
        totalG=total-descuento;

        System.out.println("Total de las horas extras: "+totalpxh+"$");
        System.out.println("Sueldo con las horas extras incluidas: "+total+ "$");
        System.out.println("Sueldo total con el descuentod del 20% incluido es: "+totalG+" $");


        
    }

}
