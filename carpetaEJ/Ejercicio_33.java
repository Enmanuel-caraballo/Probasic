import java.util.Scanner;

public class Ejercicio_33 {
    
    static int tr=0,op,opS;
  static Scanner lector = new Scanner(System.in);
  static int sexM=0,sexF=0,elementos;
  static Trabajador trabajador[] = new Trabajador[elementos];
  static Trabajador trabajador2 = new Trabajador();
  static Trabajador sueldo[]= new Trabajador[elementos];
  static Trabajador sueldos = new Trabajador();
  
  

    public static void main(String[] args) {
        System.out.println("Indique el sexo del trabajador 1(Femenino) 2(Masculino)");
        pausa();
        if(opS==1){
            sexF++;
        }else
        sexM++;
       do{
        trabajador2=new Trabajador();
       
        System.out.println("Ingrese el nombre del trabajador");
        trabajador2.name=lector.next();
        System.out.println("Ingrese el apellido del trabajador");
        trabajador2.apellido=lector.next();
        System.out.println("Ingrese el sueldo del trabajador");
        trabajador2.sueldo=lector.nextInt();
        trabajador[tr]=trabajador2;
        System.out.println("el trabajador ha sido reistrado con exito");
        tr++;
        System.out.println("Desea registrar un nuevo trbajador 1(si) 2");

        op=lector.nextInt();

    }while(op==1);

       
        
    }
   

        
    
  


    public static void pausa (){
      
        System.out.println("Presiona Enter para continuar...");
        lector.nextLine();
        System.out.println("Continuando después de Enter.");
    }
    
    

}

