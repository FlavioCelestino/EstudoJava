import java.util.Scanner;
import java.util.Locale;

public class ex06 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        int n = sc.nextInt();

        if(n>0){
            System.out.println("POSITIVO");
        }else{
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
