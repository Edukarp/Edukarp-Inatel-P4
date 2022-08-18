public class Main {
    public static void main(String[] args) {

        //Criando Karts
        Kart k1 = new Kart();
        k1.nome = "Egg1";

        Kart k2 = new Kart();
        k2.nome = "Standard";

        //Criando Pilotos
        Piloto p1 = new Piloto();
        p1.nome = "Link";
        p1.vilao = false;

        Piloto p2 = new Piloto();
        p2.nome = "Wario";
        p2.vilao = true;

        //Associando o Kart ao Piloto
        k1.p = p1;
        k2.p = p2;

        //Definindo valores do motor
        k1.m.cilindradas = "100cc";
        k1.m.velocidadeMaxima = 150;

        k2.m.cilindradas = "100cc";
        k2.m.velocidadeMaxima = 100;

        System.out.println("Copa " + k1.m.cilindradas + "!");

        //Iniciando eventos (metodos)
        k1.p.soltaSuperPoder();
        k1.pular();
        k1.soltarTurbo();
        k1.fazerDrift();

        k2.pular();
        k2.soltarTurbo();
        k2.p.soltaSuperPoder();

    }
}
