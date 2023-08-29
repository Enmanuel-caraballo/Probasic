import java.util.Scanner;
public class Ejercicio_6 {
    static Scanner lector = new Scanner(System.in);
    static int media,ndato,op, i, dato=0;
    public static void main(String[] args) {
        do{
            System.out.println("Ingrese el dato");
            dato=lector.nextInt();
            ndato ++;
            System.out.println("¿desesa ingresar un nueveo dato 1(si) 2(no)?");
            op=lector.nextInt();
            if(op!=1){
           media = (dato+dato+dato++)/ndato;
            }
          
            
        }while(op==1);
        
        
    }
    
}
