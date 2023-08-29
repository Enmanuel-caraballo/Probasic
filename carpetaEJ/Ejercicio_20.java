import java.util.Scanner;
public class Ejercicio_20 {
    static Scanner lector= new Scanner(System.in);
    static int elementos=5;
   
    static int pos,nt=0;
    static double total,totalp,sumap,doble1,doble2,doble3,doble4,doble5;
    static double nt1,nt2,nt3,nt4,nt5;


    public static void main(String[] args) {
        System.out.println("Digite la 1° notas ");
        nt1=lector.nextDouble();
        System.out.println("Digite la 2° notas ");
        nt2=lector.nextDouble();
        System.out.println("Digite la 3° notas ");
        nt3=lector.nextDouble();
        System.out.println("Digite la 4° notas ");
        nt4=lector.nextDouble();
        System.out.println("Digite la 5° notas ");
        nt5=lector.nextDouble();
        
       
       
        total=nt1+nt2+nt3+nt4+nt5;
        
       System.out.println("la suma de las notas es: "+total);
        calculoPromedio();
        System.out.println("__________________________________");
        dobladorN();

        
    }
    
    public static void calculoPromedio(){
        sumap=nt1+nt2+nt3+nt4+nt5;
        totalp=nt1+nt2+nt3+nt4+nt5/5;
        System.out.println("El promedio de las notas es: "+totalp);

    }
    public static void dobladorN(){
        doble1=nt1*2;
        doble2=nt2*2;
        doble3=nt3*2;
        doble4=nt4*2;
        doble5=nt5*2;
        System.out.println("el doble de la nota 1 es: "+doble1);
         System.out.println("el doble de la nota 2 es: "+doble2);
          System.out.println("el doble de la nota 3 es: "+doble3);
          System.out.println("el doble de la nota 4 es: "+doble4);
          System.out.println("el doble de la nota 5 es: "+doble5);

          

    }
}
