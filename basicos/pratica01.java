

import java.util.Scanner;

import java.util.Locale;

public class pratica01

 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tres valores para o triangulo A:");
        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        double Z = sc.nextDouble();

        double P = (X+Y+Z)/2;

        System.out.println("Digite tres valores para o triangulo B:");
        double X1 = sc.nextDouble();
        double Y1 = sc.nextDouble();
        double Z1 = sc.nextDouble();

        double P1 = (X1+Y1+Z1)/2;

        double area = Math.sqrt(P*(P-X)*(P-Y)*(P-Z)); 

        double area1 = Math.sqrt(P1*(P1-X1)*(P1-Y1)*(P1-Z1)); 

        System.out.printf("O valor da area A é: %.2f%n", area);

        System.out.printf("O valor da area B é: %.2f%n", area1);

        if(area>area1){
            System.out.println("O maior triangulo é A");
        }else{
            System.out.println("O maior triangulo é B");
        }

        sc.close();
    }
}