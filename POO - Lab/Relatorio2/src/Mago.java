public class Mago extends PersonagemDeJogador implements AtacanteMagico{
    
    private String especialidadeElemental;
    private int mana;

    public Mago(String nome, String genero, int nivel, int vida, String especialidadeElemental, int mana) {
        super(nome, genero, nivel, vida);
        this.especialidadeElemental = especialidadeElemental;
        this.mana = mana;
    }

    public void recuperarMana(int qnt){
        mana = mana + qnt;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Especialidade Elemental: " + especialidadeElemental + "       Mana: " + mana);
        System.out.println("----------------------------------------------------");
    }

    @Override
    public void ataqueMagico() {
        mana = mana - 35;
        if(mana < 0)
            System.out.println("Mana Esgotada!");
        else
            System.out.println(nome + " Atacou causando " + (int)((mana*3.5)/nivel) + " de dano!");
    }
}
