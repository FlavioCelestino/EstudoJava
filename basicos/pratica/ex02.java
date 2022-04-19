import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextInt();
        double pi = 3.14159;
        double area = pi*raio*raio;

        System.out.println("A= " + area);



        sc.close();
    }
}
