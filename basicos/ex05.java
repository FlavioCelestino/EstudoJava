//PROGRAMA QUE LE O NUMERO DO FUNCIONARIO, HORAS TRABALHADAS E SALARIO COM DUAS CASAS DECIMAIS

import java.util.Scanner;

public class ex05
 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE O CODIGO DA PEÇA 01: ");

        // int id1;
        // id1 = sc.nextInt();


        System.out.println("DIGITE A QUANTIDADE DE PEÇAS 01: ");

        int qtd1;
        qtd1 = sc.nextInt();

        System.out.println("DIGITE O VALOR UNITARIO DA PEÇA 01: ");

        double valor1, total1;
        valor1 = sc.nextDouble();

        total1 = qtd1*valor1;

        System.out.println("DIGITE O CODIGO DA PEÇA 02: ");

        // int id2;
        // id2 = sc.nextInt();


        System.out.println("DIGITE A QUANTIDADE DE PEÇAS 02: ");

        int qtd2;
        qtd2 = sc.nextInt();

        System.out.println("DIGITE O VALOR UNITARIO DA PEÇA 02: ");

        double valor2, total2, total;
        valor2 = sc.nextDouble();

        total2 = qtd2*valor2;

        total = total1 + total2;
        
        System.out.printf("VALOR A PAGAR = R$ %.2f%n" , total);

        sc.close();
    }
}