import entities.CurrencyConverter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.printf("Valor do dolar hoje: R$ %.2f %n",CurrencyConverter.getDOLAR());
        double valorEmReal = 200.00;
        System.out.printf("%.2f em dolar é %.2f %n",valorEmReal,CurrencyConverter.dolarEmReal(valorEmReal));
    }
}
