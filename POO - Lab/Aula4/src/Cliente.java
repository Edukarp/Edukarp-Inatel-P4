public class Cliente {

    public String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    public void solicitarServico(Empresa empresa) {
        System.out.println(nome + " solicia Servico de " + empresa.nome);
    }

}
