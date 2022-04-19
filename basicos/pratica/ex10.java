import java.util.Scanner;
import java.util.Locale;

public class ex10 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo do produto: ");

        int n = sc.nextInt();

        System.out.println("Digite a quantidade: ");

        int x = sc.nextInt();

        double total=0;


        if(n==1){
            total = 4*x;
        }
        else if(n==2){
            total = 4.5*x;
        }        
        else if(n==3){
            total = 5*x;
        }
        else if(n==4){
            total = 2*x;
        }
        else if(n==5){
            total = 1.5*x;
        }
        else{
            System.out.println("erro - codigo de produto invalido");
        }

        System.out.printf("Valor total = R$ %.2f%n", total);

        
        sc.close();
    }
}
