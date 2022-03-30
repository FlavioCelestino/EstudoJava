package source.application;

import java.util.Locale;
import java.util.Scanner;

import source.util.triangulo;

public class pratica{

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        triangulo x,y;

        x = new triangulo();
        y = new triangulo();

        System.out.println("Digite tres valores para o triangulo A:");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite tres valores para o triangulo B:");

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areax = x.area();
        double areay = y.area();

        System.out.printf("O valor do triangulo X é: %.2f%n", areax);

        System.out.printf("O valor do triangulo Y é: %.2f%n", areay);


        if(areax>areay){
            System.out.println("O triangulo maior é X");
        }else{
            System.out.println("O triangulo maior é Y");
        }

        sc.close();
    }

}