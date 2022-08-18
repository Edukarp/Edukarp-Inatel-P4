public class Arma {

    int poder;

    public Arma(){
        poder = 1;
    }

    void atacarChefao(Chefao chefao){
        chefao.barraVida -= poder;
        System.out.println("Chefao tomou " + poder + " de dano");
        if(chefao.barraVida <= 0)
            System.out.println("O jogador ganhou!");

    }

}
