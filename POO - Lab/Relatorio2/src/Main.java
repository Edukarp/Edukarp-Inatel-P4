public class Main {
    public static void main(String[] args) {

        Guerreiro g1 = new Guerreiro("Conan","Masc",19,350);
        Mago m1 = new Mago("Merida","Fem",20,130,"Terra",300);
        Ladino l1 = new Ladino("Lucatiel","Masc",19,200,4,9);

        Guilda guilda1 = new Guilda();

        guilda1.addMembro(g1);
        guilda1.addMembro(m1);
        guilda1.addMembro(l1);

        guilda1.listarMembros();

        g1.mostraInfo();
        g1.ataqueFisico();

        m1.mostraInfo();
        m1.ataqueMagico();
        m1.recuperarMana(15);

        l1.mostraInfo();
        l1.ataqueFisico();
        l1.addMunicao(1);

        System.out.println("________________________________________________________");
        System.out.println("Combate:");
        for(int i = 0;i<10;i++){
            g1.ataqueFisico();
            m1.ataqueMagico();
            l1.ataqueFisico();
        }
        System.out.println("________________________________________________________");
        System.out.println("FIM DA JORNADA");

    }
}
