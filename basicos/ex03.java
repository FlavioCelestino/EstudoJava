import java.util.Scanner;

public class ex03
 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio:");

        System.out.println("DIGITE 04 VALORES INTEIROS: ");

        int A,B,C,D, DIFERENCA;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        DIFERENCA = (A*B - C*D);

        System.out.println("DIFERENCA = " + DIFERENCA);

        sc.close();
    }
}