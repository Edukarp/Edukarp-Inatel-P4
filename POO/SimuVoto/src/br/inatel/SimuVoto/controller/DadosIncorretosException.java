package br.inatel.SimuVoto.controller;

public class DadosIncorretosException extends RuntimeException{

    public DadosIncorretosException(String mensagem){
        super(mensagem);
    }
}
