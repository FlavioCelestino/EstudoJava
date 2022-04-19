import java.util.Scanner;
public class ex01 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("digite dois numeros inteiros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = x+y;
        System.out.println("Soma= "+ soma);

        sc.close();
    }
}
