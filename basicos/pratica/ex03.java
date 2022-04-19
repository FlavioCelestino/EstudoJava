import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 04 valores inteiros: ");

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int soma = (A*B - C*D);

        System.out.println("DIFERENCA = " + soma);

        sc.close();
    }
}
