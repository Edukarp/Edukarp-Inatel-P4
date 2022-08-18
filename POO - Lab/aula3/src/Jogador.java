public class Jogador {

    String nome;
    int qtdVidas;

    Arma a1 = new Arma();

    public Jogador(String nome, int qtdVidas){
        this.nome = nome;
        this.qtdVidas = qtdVidas;
    }

    void pular(){
        System.out.println(nome + " pulou");
    }

    void morrer(){
        System.out.println(|"GAME OVER!");
    }
}
