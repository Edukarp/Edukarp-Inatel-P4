public class Main {
    public static void main(String[] args) {
        //Criando Funcionarios
        Funcionario[] funcionarios = new Funcionario[100];
        funcionarios[1] = new Funcionario("Eduardo", 1200);
        funcionarios[2] = new Funcionario("Maria", 3000);

        //Criando Clientes
        Cliente[] cliente = new Cliente[100];
        cliente[1] = new Cliente("Joao");
        cliente[2] = new Cliente("Jose");

        //Criando Empresa
        Empresa[] empresas = new Empresa[100];
        empresas[1] = new Empresa("Empresa1","112,334,67");
        empresas[1].departamento[1].nome = "Departameto1";
        empresas[1].departamento[1].funcao = "funcao1";

        cliente[1].solicitarServico(empresas[1]);
    }
}
//Ver no GITHUB ou NOTION do monitor pra mudar esse codigo