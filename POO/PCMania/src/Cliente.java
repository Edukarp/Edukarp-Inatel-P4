public class Cliente {

    //Declarando variaveis

    //Implicitas
    public String nome;
    public long cpf;

    //Explicitas
    Computador comp;

    //Criando Contrutor
    public Cliente(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //Realizando acoes
    public float calculaTotalCompra(){
        float valor;
        valor = comp.preco;

        return valor;
    }


}
