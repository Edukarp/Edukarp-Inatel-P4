public abstract class Pizza {

    protected float preco;

    public abstract void mostraIngredientes(); //Metodos abstratos forcam overide das herancas

    public abstract String mostraBrinde();

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
