public class ClassePrincipal {
    public static void main(String[] args) {
        Trabalhador t1 = new Trabalhador();
        t1.nome = "Roberto";
        t1.profissao = "Desenvolvedor";
        t1.salario = 20000f;
        t1.rg = "MG-123.134.45";
        t1.dataNascimento = "23/08/1998";

        Trabalhador t2 = new Trabalhador();
        t2.nome = "Eduardo";
        t2.profissao = "Desenvolvedor";
        t2.salario = 22300f;
        t2.rg = "MG-654.124.76";
        t2.dataNascimento = "11/04/2002";

        float ganhoAnual = t1.calculaGanhoAnual();

        t1.mostraInfoFuncionario();
        t1.recebeAumento(t1.salario);
        t1.mostraInfoFuncionario();
        System.out.println("Ganho Anual: " + ganhoAnual);

        t2.mostraInfoFuncionario();

        //trabalhador 2 recebe a referencia do trabalhador 1
        t2 = t1;
        t2.mostraInfoFuncionario(); //vai mostar os dados do trabalhador 1 e excluir o do 2 pois nao há mais nada apontado pra ele
    }
}
