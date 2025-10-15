package entities;

public class Programador extends Funcionario{

    public Programador(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double calcularBonificacao() {
        return getSalario() * 1.15;
    }

    @Override
    public String toString() {
        return String.format(
            "Nome: %s | Salario: %.2f | Salario programador: %.2f"
            ,getNome(),getSalario(), calcularBonificacao());
    }

}
