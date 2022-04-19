import java.util.Scanner;
import java.util.Locale;

public class ex11 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero (não inteiro): ");
        double n = sc.nextDouble();

        if(n < 0 || n>100){
            System.out.println("Fora do intervalo");
        }else if(n <=25){
            System.out.println("intervalo 0 - 25");
        }else if(n <=50){
            System.out.println("intervalo 25 - 50");
        }else if(n <=75){
            System.out.println("intervalo 50 - 75");
        }else{
            System.out.println("intervalo 75 - 100");
        }

        sc.close();
    }
}
