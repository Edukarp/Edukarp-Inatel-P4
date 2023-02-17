package br.inatel.projetocap11.controller;

import br.inatel.projetocap11.model.Aluno; //Importando de outro pacote

public class AcessoAluno {

   // Aluno a1 = new Aluno(); //Aqui precisa do import

    br.inatel.projetocap11.model.Aluno a2 =
            new br.inatel.projetocap11.model.Aluno(); //Nome lietaral da classe Aluno (FullyQualifiedName)

    public AcessoAluno(){
        Aluno a1 = new Aluno();
        //a1.matricula -> nao chama pois o protected funciona nos mesmo pacote (ou com heranca claro)
    }

}
