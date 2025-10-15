package entities;

public class LiderTecnico extends Funcionario{

    public LiderTecnico(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double calcularBonificacao() {
        return getSalario() * 1.35;
    }

    @Override
    public String toString() {
        return String.format(
            "Nome: %s | Salario: %.2f | Salario lider tecnico: %.2f"
            ,getNome(),getSalario(), calcularBonificacao());
    }

}
