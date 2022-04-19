import java.util.Scanner;
import java.util.Locale;

public class ex12 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha de 04 digitos: ");
        int senha = sc.nextInt();

        while(senha !=2002){
            System.out.println("Senha inválida");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido");



        sc.close();
    }
}
