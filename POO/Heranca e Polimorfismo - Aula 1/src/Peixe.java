public class Peixe extends Animal{

    private int nBarbatanas;

    public Peixe(String nome, int nPatas, String cor, int nBarbatanas) {
        super(nome, nPatas, cor);
        this.nBarbatanas = nBarbatanas;
    }

    @Override
    public void fazBarulho(){
        System.out.println("Blub Blub");
    }
}
