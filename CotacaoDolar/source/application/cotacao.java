package source.application;

import java.util.Locale;
import java.util.Scanner;

import source.util.ConversorMoeda;

public class cotacao{

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor atual do dolar?: U$ ");

        double dolar = sc.nextDouble();

        System.out.println("Qual o valor a ser adquirido?: U$ ");

        double qtde = sc.nextDouble();
        double resultado = ConversorMoeda.dolarParaReal(qtde, dolar);

        System.out.printf("O valor a ser pago em reais é: R$ %.2f%n", resultado);

        sc.close();
    }

}