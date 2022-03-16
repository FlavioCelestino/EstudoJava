/*leitura de senha até q seja válida*/

import java.util.Scanner;

public class ex13
 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int senha= sc.nextInt();

        while(senha != 2002){
            
           System.out.println("Senha Invalida");
           senha = sc.nextInt();
           
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}