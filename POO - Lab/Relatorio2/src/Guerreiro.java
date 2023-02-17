public class Guerreiro extends PersonagemDeJogador implements AtacanteFisico{

    public Guerreiro(String nome, String genero, int nivel, int vida) {
        super(nome, genero, nivel, vida);
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("----------------------------------------------------");
    }

    @Override
    public void ataqueFisico() {
        System.out.println(nome + " Atacou causando " + (int)((vida*1.5)/nivel) + " de dano!");
    }
}
