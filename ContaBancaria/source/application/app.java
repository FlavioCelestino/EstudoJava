package source.application;

import java.util.Locale;
import java.util.Scanner;

import source.entities.conta;


public class app {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        conta conta;

        System.out.print("Entre com o numero da conta: ");
        int number = sc.nextInt();
        System.out.print("Entre com o nome do titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Tem deposito inicial? (s/n): ");
        char response = sc.next().charAt(0);
        if (response == 's'){
            System.out.print("Entre o valor inicial do deposito: ");
            double initialDeposit = sc.nextDouble();
            conta = new conta(number, holder, initialDeposit);
        }else{
            conta = new conta(number, holder);
        }

        System.out.println();
        System.out.print("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com um valor de deposito: ");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com um valor de saque: ");
        double withdrawValue = sc.nextDouble();
        conta.withdraw(withdrawValue);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        sc.close();
}
}