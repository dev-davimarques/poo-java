package entities;

public abstract class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome nao pode ser vazio");
        }
        setSalario(salario);
        this.nome = nome;
        this.salario = salario;
    }

    // Getter's
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    // Setter's
    protected void setSalario(double salario) {
        if(salario < 0.0){
            throw new IllegalArgumentException("Salario deve ser positivo");
        }
        this.salario = salario;
    }

    // Abstract methods
    public abstract double calcularBonificacao();

    // toString
    @Override
    public String toString() {
        return String.format("Nome: %s | Salario: %.2f",nome,salario);
    }

}
