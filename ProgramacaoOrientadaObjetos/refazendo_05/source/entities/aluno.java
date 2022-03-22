package refazendo_05.source.entities;

public class aluno {

    public String nome;
    public double nota01;
    public double nota02;
    public double nota03;

    public double notafinal(){
        return nota01 + nota02 + nota03;
    }

    public double pontosFaltantes(){
        if(notafinal() < 60){

            return 60 - notafinal();
        }
        else{
            return 0.0;
        }
    }
}
