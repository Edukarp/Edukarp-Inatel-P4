public class Main {

    public static void main(String[] args) {

        //Caracteristicas de um Array
        //1.Tem tamanho pre-definido
        //2.Guarda elementos homogeneos
        //3.Declarado como um objeto

        int[] array = new int[10]; //Declaracao de um array de tamanho 10

        array[0] = 1000; //alocando valor na posicao zero do array
        array[4] = 100; //| |
        array[9] = 10;

        //Passando pelo array (modo padrao)
        for(int i = 0; i < array.length; i++){
            if(array[i] != 0) //Por ser int o Java coloca 0 nos vazios
                System.out.println(array[i]);
        }

        //For com melhor varredura(problema: sem contador(indice) / eh o for each em outras linguagens)
        for (int j : array) {
            if (j != 0)
                System.out.println(j);
        }

        System.out.println("-------------------------------------");
        System.out.println(" ");

        //"Array de Objetos"(array de referencias)
        //Arrays de Primitivos guardam valores, de 'Objetos' guardam referencias

        int n = 10;//Declarando por variavel (msm coisa do C++)
        Conta[] minhasContas = new Conta[n];

        //Passando as referencias do objeto
        //Forma 1
        Conta novaConta = new Conta();//Assim cria um novo objeto que "independe" de 'Conta'
        novaConta.saldo = 1000;
        novaConta.dono = "Joao";
        novaConta.numero = 1234;
        minhasContas[0] = novaConta;

        //Forma 2
        minhasContas[1] = new Conta();//Assim aponta diretamente para 'Conta'
        minhasContas[1].saldo = 3200;
        minhasContas[1].dono = "Maria";
        minhasContas[1].numero = 3245;

        //Varrendo um array de referencias (modo foreach)
        for (Conta aux: minhasContas) {
            if(aux != null) {//Objetos mostram referencias entao os vazios sao preenchidos com null
                System.out.println(aux);//nesse caso ta mostrando as referencias
                System.out.println(aux.dono);
                System.out.println(aux.saldo);
                System.out.println(aux.numero);
                System.out.println("-------------------------------------");
            }
        }

        /* Varrendo do modo padrao
        for (int i = 0; i< minhasContas.length; i++){
            if(minhasContas[i] != null){
                System.out.println(minhasContas[i]);//nesse caso ta mostrando as referencias
                System.out.println(minhasContas[i].dono);
                System.out.println(minhasContas[i].saldo);
                System.out.println(minhasContas[i].numero);
                System.out.println("-------------------------------------");
            }

        }
         */

    }
}
