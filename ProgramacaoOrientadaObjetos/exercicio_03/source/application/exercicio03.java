package exercicio_03.source.application;



import java.util.Locale;
import java.util.Scanner;
import exercicio_03.source.entities.retangulo;

public class exercicio03 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        retangulo ret = new retangulo();

        System.out.printf("Digite o valor da altura e comprimento do retangulo: ");
        ret.height = sc.nextDouble();
        ret.width = sc.nextDouble();

        System.out.printf("O valor da area é : %.2f%n", ret.area());
        System.out.printf("O valor da perimetro é : %.2f%n", ret.perimeter());
        System.out.printf("O valor da diagonal é : %.2f%n", ret.diagonal());

        sc.close();
    }
}
