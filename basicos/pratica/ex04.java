import java.util.Scanner;
import java.util.Locale;

public class ex04 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do funcionario: ");
        int funcionario = sc.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double horas = sc.nextDouble();

        System.out.println("Digite o valor hh");
        double hh = sc.nextDouble();

        System.out.println("NUMBER= " + funcionario);

        double salario = horas*hh;

        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
