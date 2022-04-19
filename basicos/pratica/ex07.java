import java.util.Scanner;
import java.util.Locale;

public class ex07 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");

        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
        
        sc.close();
    }
}
