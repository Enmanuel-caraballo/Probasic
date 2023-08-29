public class Ejercicio_21 {
    static int a,b;
    public static void main(String[] args) {
        a=5;
        b=10;

        System.out.println("El valor de a es: "+a+" y el valor de b es: "+b);

        int temp=a;
        a=b;
        b=temp;
        System.out.println("Ahora el valor de a es: "+a+" y el valor de b es: "+b);
        
        
    }
}
