/*escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/

import java.util.Scanner;

public class ex11
 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE O CODIGO DO PRODUTO (1 A 5) E INFORME A QUANTIDADE: ");

        int codigo,quantidade;
        codigo= sc.nextInt();
        quantidade= sc.nextInt();

        double total;

        if (codigo==1){
            total =quantidade*4.00;
        }
        else if(codigo==2){
            total =quantidade*4.50;
        }
        else if(codigo==3){
            total =quantidade*5.00;
        }
        else if(codigo==4){
            total =quantidade*2.00;
        }
        else{
            total = quantidade*1.50;
        }

        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();
    }
}