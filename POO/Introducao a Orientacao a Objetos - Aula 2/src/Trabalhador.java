public class Trabalhador {

    //Atributos
    String nome;
    String profissao;
    float salario;
    String rg;
    String dataNascimento;

    //Metodos
    void recebeAumento(float valor){
        salario = valor*1.6f;
        System.out.println("Novo Salario: " + valor);
        salario = valor;

    }

    float calculaGanhoAnual(){
        return salario*13;
    }

    void mostraInfoFuncionario(){
        System.out.println("---------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Profissao: " + profissao);
        System.out.println("Salario: " + salario);
        System.out.println("RG: " + rg);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("---------------------------------------");
    }

}
