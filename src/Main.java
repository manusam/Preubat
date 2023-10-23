import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un valor");
        int a = entrada.nextInt();
        System.out.println("introduce otro valor");
        int b = entrada.nextInt();
        if (a<b){
            System.out.println(b+" Es el mayor");
        }else if(a>b){
            System.out.println(a+" Es el mayor");
        }else{
            System.out.println("Son iguales");
        }

    }
}