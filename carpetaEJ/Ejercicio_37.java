import java.util.Scanner;

public class Ejercicio_37 {
    static Scanner lector = new Scanner(System.in);
    static int minutos,op,hrs,total,tasaXhrs=15;
    static double total2;
    
    
    public static void main(String[] args) {
        System.out.println("¿Su tiempo de parqueo fue menor a una hora? 1(si) 2(no)");
        op=lector.nextInt();
        if(op==1){
            System.out.println("Ingrese los minutos de parqueo");
            minutos=lector.nextInt();
            total2=minutos*0.25;
            System.out.println("El total a pagar por el tiempo den parqueo es: "+total2+"$");
        }else
       
        System.out.println("Ingrese las horas de parqueo");
        hrs=lector.nextInt();
         total=hrs*tasaXhrs;
        System.out.println("Ingrese los minutos de parqueo");
        minutos=lector.nextInt();
        if(minutos>=10){
            hrs=hrs+1;
            total=hrs*tasaXhrs;
            

        }else if(minutos<=9){
             total=hrs*tasaXhrs;  


        }

      
        System.out.println("Usted debera pagar un total de: "+total+"$ por las horas de parqueo");
        
    }
}
