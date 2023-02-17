package br.inatel.SimuVoto.model;

import java.util.ArrayList;

public class Candidato {

    private String nome;
    private String cpf;
    int numero;
    private ArrayList<String> votos = new ArrayList<>();

    public Candidato(String nome, String cpf, int numero) {
        this.nome = nome;
        this.cpf = cpf;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<String> getVotos() {
        return votos;
    }

    public void setVotos(ArrayList<String> votos) {
        this.votos = votos;
    }

    public String converteInfo() {
        return "Nome do Candidato: " + nome + "\n" +
                "CPF do Candidato: " + cpf + "\n" +
                "Cpf dos Votos: " +"\n"+
                getVotos() + "\n" +
                "--- --- --- --- --- ---";
    }
}
