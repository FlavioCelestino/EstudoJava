package exercicio_05.source.entities;

public class aluno {
    public String nome;
    public double nota01;
    public double nota02;
    public double nota03;

    public double notaFinal(){
        return nota01 + nota02 + nota03;
    }
    public double pontosFaltantes(){
        if(notaFinal() < 60){

            return 60 - notaFinal();
        }
        else{
            return 0.0;
        }
    }
}


