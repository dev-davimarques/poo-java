package entities;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private double valorConta;

    public Conta(int numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public Conta(int numeroConta, String nomeTitular, double valorInicial){
        this.numeroConta = numeroConta;
        setNomeTitular(nomeTitular);
        deposito(valorInicial);
    }

    // Getter's e Setter's
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getValorConta() {
        return valorConta;
    }

    // Methods
    public void deposito(double valor){
       valorConta += valor;
    }

    public void saque(double valor){
        valorConta -= valor + 5;
    }

    @Override
    public String toString() {
        return String.format("%d | %s | %.2f%n",getNumeroConta(),getNomeTitular(),getValorConta());
    }
    
}
