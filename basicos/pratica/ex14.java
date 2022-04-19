import java.util.Scanner;
import java.util.Locale;

public class ex14 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        int tipo = sc.nextInt();

        while(tipo !=4){
            if(tipo==1){
                alcool +=1;
            }else if(tipo==2){
                gasolina +=1;
            }else if(tipo==3){
                diesel +=1;
            }
            tipo = sc.nextInt();
        }

        System.out.println("obrigado!");
        System.out.println("Alcool: "+alcool);
        System.out.println("diesel: "+diesel);
        System.out.println("Gasolina:"+gasolina);


        sc.close();
    }
}
