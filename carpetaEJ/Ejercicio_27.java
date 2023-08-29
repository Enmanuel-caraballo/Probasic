import java.util.Scanner;
public class Ejercicio_27 {
static Scanner lector=new Scanner(System.in);
static int op;
static String name;

public static void main(String[] args) {
    System.out.println("Ingrese su nombre");
     name=lector.nextLine();
    System.out.println("Indique su sexo 1(Masculino) 2(femenino) 3(otro) ");
     op= lector.nextInt();
   
    
    switch(op){
        case 1:
        System.out.println("Bienvenido "+name);
        break;
        case 2:
        System.out.println("Bienvenida "+name);
        break;
        case 3:
        System.out.println("Hola indeciso "+name);
        break;

       
    }
}

   

}
