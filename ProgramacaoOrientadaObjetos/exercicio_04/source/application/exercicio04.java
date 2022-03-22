package exercicio_04.source.application;



import java.util.Locale;
import java.util.Scanner;
import exercicio_04.source.entities.empregado;

public class exercicio04 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        empregado emp = new empregado();

        System.out.printf("Digite o nome do funcionario: ");
        emp.nome = sc.next();
        System.out.printf("Digite o valor do salário: ");
        emp.salarioBruto = sc.nextDouble();
        System.out.printf("Digite o valor do imposto: ");
        emp.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Empregado: " + emp);
        System.out.println();
        System.out.println("Qual o valor da porcentagem de imposto? ");
        double porcentagem = sc.nextDouble();
        emp.aumentoSalario(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + emp);


        sc.close();
    }
}
