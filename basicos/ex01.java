/*  Soma de inteiros*/
import java.util.Scanner;
public class ex01 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int A, B, soma;
        System.out.println("Digite dois numeros:");
        
        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;

        System.out.println("SOMA= " + soma);

        sc.close();
    }
}
