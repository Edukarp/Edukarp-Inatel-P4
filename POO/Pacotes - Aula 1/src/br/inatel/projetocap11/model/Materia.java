package br.inatel.projetocap11.model; //Pacote em que a classe pertence

import br.inatel.projetocap11.controller.AcessoAluno; //Importando de outro pacote

public class Materia {

    public Materia(){
        Aluno a1 = new Aluno();
        System.out.println(a1.matricula);
    }

    AcessoAluno acessoAluno = new AcessoAluno();
}
