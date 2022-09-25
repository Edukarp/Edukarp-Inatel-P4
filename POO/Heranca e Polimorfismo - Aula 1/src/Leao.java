public class Leao extends Animal{

    private float tamJuba;

    public Leao(String nome, int nPatas, String cor, float tamJuba) {
        super(nome, nPatas, cor);
        this.tamJuba = tamJuba;
    }

    @Override
    public void fazBarulho(){
        System.out.println("Rwar");
    }
}
