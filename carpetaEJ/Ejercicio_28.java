public class Ejercicio_28 {
   
    public static void main(String[] args) throws InterruptedException {
       int segundos=9;
       for(int i=segundos;i>=0;i--){
        System.out.println("TIEMPO RESTANTE "+i+"seg");
        Thread.sleep(1000);


        
       }
       System.out.println("tiempo agotado");
       Thread.sleep(2000);
       System.out.println("***BOOOOOOOOOOOOOMMMM***");

        
    }
}
