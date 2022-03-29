package source.util;

public class ConversorMoeda {
    
    public static final double IOF = 0.06;

    public static double dolarParaReal(double qtde, double dolar){
        return qtde * dolar * (1+IOF);
    }
}
