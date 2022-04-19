import java.util.Scanner;
import java.util.Locale;

public class ex09 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial e final do jogo: ");

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;

        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }
        else{
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.print("O JOGO DUROU " + duracao + " HORAS.");

        
        sc.close();
    }
}
