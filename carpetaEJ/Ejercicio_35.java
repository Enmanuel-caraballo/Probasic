import java.util.Scanner;

public class Ejercicio_35 {
    static Scanner lector = new Scanner(System.in);
    static int pagoXhrs=5000,hrs_tra,sueldo,sueldoP;
    static double tasa=0.5,total, porcentaje;
    
    public static void main(String[] args) {
        System.out.println("Ingrese las horas trabajadas");
        hrs_tra=lector.nextInt();

        if(hrs_tra>=40){
            sueldo=hrs_tra*pagoXhrs;
            porcentaje=sueldo*tasa;
            total=sueldo+porcentaje;
            System.out.println("Usted debera cobrar un total de: "+total+"$");

        }else{
            total=pagoXhrs*hrs_tra;
            System.out.println("Usted debera cobrar un monto de: "+total+"$");
        }

        
    }
}
