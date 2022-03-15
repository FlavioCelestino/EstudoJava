/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

import java.util.Scanner;

public class ex10
 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE O HORARIO INICIAL E HORARIO FINAL: ");

        int horaInicial,horaFinal;
        horaInicial= sc.nextInt();
        horaFinal= sc.nextInt();

        int total;

        if (horaInicial<horaFinal){
            total = horaFinal-horaInicial;
        }
        
        else{
            total = 24 - horaInicial + horaFinal;
        }
        System.out.println("O JOGO DUROU " + total + " HORA(S).");
        sc.close();
    }
}