package br.inatel.SimuVoto.model;

public class Eleitor {

    private String cpf;
    private int voto;

    public Eleitor(String cpf, int voto) {
        this.cpf = cpf;
        this.voto = voto;
    }

    public String getCpf() {
        return cpf;
    }

    public int getVoto() {
        return voto;
    }
}
