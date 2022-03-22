package exercicio_05.source.application;



import java.util.Locale;
import java.util.Scanner;
import exercicio_05.source.entities.aluno;

public class exercicio05 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        aluno aluno = new aluno();

        aluno.nome = sc.nextLine();
        aluno.nota01 = sc.nextDouble();
        aluno.nota02 = sc.nextDouble();
        aluno.nota03 = sc.nextDouble();

        System.out.println(aluno.nome);
        
        System.out.printf("Nota final: %.2f%n",aluno.notaFinal());

        if(aluno.notaFinal() < 60){
            System.out.println("reprovou");
            System.out.printf("Faltam: %.2f%n pontos", aluno.pontosFaltantes());
        }
        else{
            System.out.println("Passou!");
        }



        sc.close();
    }
}
