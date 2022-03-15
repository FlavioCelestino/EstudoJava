import java.util.Scanner;
public class ex02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio:");


        double raio, area, pi;

        pi = 3.14159;
        raio = sc.nextDouble();

        area = pi*raio*raio;

        System.out.println("Resultado: "+ area);

        sc.close();
    }
}