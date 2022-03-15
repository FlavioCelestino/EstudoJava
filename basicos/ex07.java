//ler um numero inteiro e dizer se é positivo ou negativo.

import java.util.Scanner;

public class ex07
 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE UM NUMERO INTEIRO: ");

        int n;
        n= sc.nextInt();

        if (n<0){
            System.out.println("ESSE NUMERO E NEGATIVO");
        }
        else{
            System.out.println("ESSE NUMERO E POSITIVO");
        }

        sc.close();
    }
}