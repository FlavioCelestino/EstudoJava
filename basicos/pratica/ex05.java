import java.util.Scanner;
import java.util.Locale;

public class ex05 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("insira o codigo da peça 1: ");
        // int codigo1 = sc.nextInt();

        System.out.println("insira a quantidade de peças: ");
        int qtde1 = sc.nextInt();

        System.out.println("insira o valor unitario de cada peça 1: ");
        double valorUnitario1 = sc.nextDouble();

        System.out.println("insira o codigo da peça 2: ");
        // int codigo2 = sc.nextInt();

        System.out.println("insira a quantidade de peças: ");
        int qtde2 = sc.nextInt();

        System.out.println("insira o valor unitario de cada peça 2: ");
        double valorUnitario2 = sc.nextDouble();

        double total1 = qtde1*valorUnitario1;
        double total2 = qtde2*valorUnitario2;

        double soma = total1 + total2;

        System.out.printf("O valor total da compra é: R$ %.2f%n", soma);

        sc.close();
    }
}
