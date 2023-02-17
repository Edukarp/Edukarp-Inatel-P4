public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);
        System.out.println("Salario: " + salario);
    }
}
