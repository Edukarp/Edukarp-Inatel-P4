public class Kart {

    String nome;
    Motor m;
    Piloto p; //Agregacao

    //Composicao
    public Kart(){
        m = new Motor();
    }
    void pular(){
        System.out.println(p.nome + " pulou...");
    }
    void soltarTurbo(){
        System.out.println(p.nome + " soltou turbo a " + m.velocidadeMaxima + "Km/h com seu Kart " + nome);
    }
    void fazerDrift(){
        System.out.println(p.nome + " fez drift a " + m.velocidadeMaxima + "Km/h com seu Kart " + nome);
    }

}
