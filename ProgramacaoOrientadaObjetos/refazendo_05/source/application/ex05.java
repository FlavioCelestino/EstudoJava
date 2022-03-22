package refazendo_05.source.application;



import java.util.Locale;
import java.util.Scanner;
import refazendo_05.source.entities.aluno;

public class ex05 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        aluno aluno = new aluno();
        
        System.out.println("Digite o nome e as 3 notas: ");
        
        aluno.nome  =sc.nextLine();
        aluno.nota01 = sc.nextDouble();
        aluno.nota02 = sc.nextDouble();
        aluno.nota03 = sc.nextDouble();

        System.out.println(aluno.nome);

        if(aluno.notafinal() < 60){
            System.out.printf("Reprovou, necessita de %.2f%n pontos", aluno.pontosFaltantes());
        }
        else{
            System.out.println("Passou!");
        }


        sc.close();
    }
}
