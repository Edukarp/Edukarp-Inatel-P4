public class Guilda {
    private PersonagemDeJogador[] membros = new PersonagemDeJogador[5];
    private static int numMembros = 0;

    public Guilda() {
    }

    public void addMembro(PersonagemDeJogador personagem){
        membros[numMembros] = personagem;
        numMembros++;
    }

    public void listarMembros(){
        System.out.println("----------------------------------------------------");
        for(int i = 0; i<membros.length;i++)
            if(membros[i] != null)
                System.out.println("Membro " + i +": " + membros[i].nome);
        System.out.println("----------------------------------------------------");
    }

}
