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

    public int getnBarbatanas() {
        return nBarbatanas;
    }

    public void setnBarbatanas(int nBarbatanas) {
        this.nBarbatanas = nBarbatanas;
    }
}
