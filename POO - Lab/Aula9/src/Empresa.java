import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;

    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private int totalFuncionarios;

    private  ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
    private int totalDepartamentos;

    public Empresa(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
        totalFuncionarios++;
    }
    public void addDepartamento(String nome, double orcamento){
        Departamento departamento = new Departamento(nome, orcamento);
        departamentos.add(departamento);
        totalDepartamentos++;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Cnpj: " + cnpj);
        System.out.println("Total Func. = " + totalFuncionarios);
        System.out.println("Total Dept. = " + totalDepartamentos);
    }

    public void listarFuncionarios(){
        //Nao precisa tratar a posicao null!!
        for(Funcionario funcionario: funcionarios){
            funcionario.mostrarInfo();
        }
    }

    public void listarDepartamentos(){
        for(Departamento departamento: departamentos){
            departamento.mostrarInfo();
        }
    }
}
