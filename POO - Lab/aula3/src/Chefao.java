public class Chefao {

    int barraVida;

    public Jogador jogador;

    public Chefao(Jogador jogador){
        this.jogador = jogador;
        barraVida = 100;
    }

    void atacarJogador(){
        jogador.qtdVidas -= 1;
        System.out.println("O jogador " + jogador.nome + "agora possui " + jogador.qtdVidas + " vidas");
        if(jogador.qtdVidas <= 0){
            jogador.morrer();
        }

    }
}
