//ler um numero inteiro e dizer se é par ou impar

import java.util.Scanner;

public class ex08
 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE UM NUMERO INTEIRO: ");

        int n;
        n= sc.nextInt();

        if (n%2==0){
            System.out.println("ESSE NUMERO E PAR");
        }
        else{
            System.out.println("ESSE NUMERO E IMPAR");
        }

        sc.close();
    }
}