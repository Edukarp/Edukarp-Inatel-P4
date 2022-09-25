public class Animal {

    protected String nome;
    protected int nPatas;
    protected String cor;

    public Animal(){

    }

    public Animal(String nome, int nPatas, String cor) {
        this.nome = nome;
        this.nPatas = nPatas;
        this.cor = cor;
    }

    public void fazBarulho(){
        System.out.println("Barulho");

    }

}
