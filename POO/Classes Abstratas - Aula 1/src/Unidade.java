public abstract class Unidade { //Classe abstrata nao pode ser instaciada, usada pelas herancas

    protected String endereco;
    protected String nomeResponsavel;

    public void mostraPizza(){

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }
}
