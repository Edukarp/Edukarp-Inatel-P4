public class Empresa {

    public String nome;
    public String cnpj;

    public Cliente cliente;
    public Funcionario funcionario;

    public Departamento[] departamento = new Departamento[100];;

    public Empresa(String nome, String cnpj){ //, Cliente cliente, Funcionario funcionario){
        this.nome = nome;
        this.cnpj = cnpj;
        //this.cliente = cliente;
        //this.funcionario = funcionario;
    }

    public void pagarFuncionarios(){
        for()
    }
}
