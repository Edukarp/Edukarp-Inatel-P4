public abstract class PersonagemDeJogador {

    protected String nome;
    protected String genero;
    protected int nivel;
    protected int vida;

    public PersonagemDeJogador(String nome, String genero, int nivel, int vida) {
        this.nome = nome;
        this.genero = genero;
        this.nivel = nivel;
        this.vida = vida;
    }

    public void mostraInfo(){
        System.out.println("----------------------------------------------------");
        System.out.println("Nome: " + nome + "       Genero: " + genero);
        System.out.println("Nivel: " + nivel + "       Vida: " + vida);
    }
}
