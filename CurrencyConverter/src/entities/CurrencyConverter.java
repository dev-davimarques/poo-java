package entities;

public class CurrencyConverter {
    private static double DOLAR = 3.10;
    private double iof = 0.06;

    public static double getDOLAR() {
        return DOLAR;
    }

    public static double dolarEmReal(double valor){
        return getDOLAR() * (valor * (1 + 0.06));
    }

}
