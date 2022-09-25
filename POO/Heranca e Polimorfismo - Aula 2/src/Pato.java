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

    public float getTamBico() {
        return tamBico;
    }

    public void setTamBico(float tamBico) {
        this.tamBico = tamBico;
    }
}
