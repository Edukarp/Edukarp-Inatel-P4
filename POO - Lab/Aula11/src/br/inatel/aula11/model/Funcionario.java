package br.inatel.aula11.model;

public class Funcionario {
    private String nome;
    private String CPF;

    public Funcionario(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String converteInfo(){
        return "Nome: " + nome + "\nCPF: " + CPF + "\n-----------------";
    }
}
