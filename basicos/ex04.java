//PROGRAMA QUE LE O NUMERO DO FUNCIONARIO, HORAS TRABALHADAS E SALARIO COM DUAS CASAS DECIMAIS

import java.util.Scanner;

public class ex04
 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE O NUMERO DO FUNCIONARIO: ");

        int id;
        id = sc.nextInt();


        System.out.println("DIGITE O VALOR DE HORAS TRABALHADAS E O VALOR HH: ");

        double hora, hh, salario;

        hora = sc.nextDouble();
        hh = sc.nextDouble();

        salario = hora*hh;

        System.out.println("NUMERO DO FUNCIONARIO = " + id);
        System.out.printf("SALARIO = R$ %.2f%n" , salario);

        sc.close();
    }
}