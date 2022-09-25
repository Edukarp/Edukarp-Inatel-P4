public class Pato extends Animal{

    private float tamBico;

    public Pato(String nome, int nPatas, String cor, float tamBico) {
        super(nome, nPatas, cor);
        this.tamBico = tamBico;
    }

    @Override
    public void fazBarulho(){
        System.out.println("Quack Quack");
    }
}
