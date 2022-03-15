//ler dois numeros inteiros e dizer se multiplos ou não

import java.util.Scanner;

public class ex09
 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE DOIS NUMEROS INTEIROS: ");

        int A,B;
        A= sc.nextInt();
        B= sc.nextInt();


        if (A % B==0||B % A==0){
            System.out.println("SAO MULTIPLOS");
        }
        else{
            System.out.println("NAO SAO MULTIPLOS");
        }

        sc.close();
    }
}