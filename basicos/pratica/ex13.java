import java.util.Scanner;
import java.util.Locale;

public class ex13 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite duas coordenadas: ");
        int X = sc.nextInt();
        int Y = sc.nextInt();

        while(X !=0 && Y !=0){
            if(X>0 && Y>0){
                System.out.println("Q1");
            }else if(X<0 && Y>0){
                System.out.println("Q2");
            }else if(X<0 && Y<0){
                System.out.println("Q3");
            }else{
                System.out.println("Q4");
            }
            X = sc.nextInt();
            Y = sc.nextInt();
        }
        sc.close();
    }
}
