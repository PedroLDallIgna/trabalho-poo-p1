package model;

public class Funcionario extends Pessoa {
    private String registro;
    private double salario;
    
    public Funcionario(String nome, int idade, String endereco, char sexo, double altura, String telefone, String registro, double salario) {
        super(nome, idade, endereco, sexo, altura, telefone);
        this.registro = registro;
        this.salario = salario;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
