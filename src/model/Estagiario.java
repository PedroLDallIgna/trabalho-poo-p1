package model;

public class Estagiario extends Funcionario {
    private boolean bolsa;
    private int horas_servico;

    public Estagiario(String nome, int idade, String endereco, char sexo, double altura, String telefone, String registro, double salario, boolean bolsa, int horas_servico) {
        super(nome, idade, endereco, sexo, altura, telefone, registro, salario);
        this.bolsa = bolsa;
        this.horas_servico = horas_servico;
    }

    public boolean isBolsa() {
        return bolsa;
    }

    public void setBolsa(boolean bolsa) {
        this.bolsa = bolsa;
    }

    public int getHoras_servico() {
        return horas_servico;
    }

    public void setHoras_servico(int horas_servico) {
        this.horas_servico = horas_servico;
    }
}
