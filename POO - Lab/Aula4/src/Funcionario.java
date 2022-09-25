public class Funcionario {

    public String nome;
    public float salario;

    public Funcionario(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void trabalhar(){
        System.out.println(nome + " esta trabalahando...");

    }
}
