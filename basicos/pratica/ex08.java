import java.util.Scanner;
import java.util.Locale;

public class ex08 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x%y==0 || y%x==0){
            System.out.println("MULTIPLOS");
        }else{
            System.out.println("Ñ MULTIPLOS");
        }
        
        sc.close();
    }
}
