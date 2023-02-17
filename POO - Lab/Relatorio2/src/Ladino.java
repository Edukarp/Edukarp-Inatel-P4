public class Ladino extends PersonagemDeJogador implements AtacanteFisico{

    private int alcanceArco;
    private int numFlechas;

    public Ladino(String nome, String genero, int nivel, int vida, int alcanceArco, int numFlechas) {
        super(nome, genero, nivel, vida);
        this.alcanceArco = alcanceArco;
        this.numFlechas = numFlechas;
    }

    public void addMunicao(int qnt){
        numFlechas = numFlechas + qnt;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Alcance: " + alcanceArco + "       Numero de Flechas: " + numFlechas);
        System.out.println("----------------------------------------------------");
    }

    @Override
    public void ataqueFisico() {
        numFlechas = numFlechas-1;
        if(numFlechas < 0)
            System.out.println("Sem Flechas!!");
        else
            System.out.println(nome + " Atacou causando " + 34 + " de dano!");
    }
}
