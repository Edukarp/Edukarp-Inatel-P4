public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        Cliente cliente1 = new Cliente("Eduardo", "1128388328");

        /* COM O PUBLIC

        conta1.titular = cliente1;
        conta1.numero = 1600;
        conta1.saldo = 1000f;
        conta1.limite = 10000f;

        conta1.sacar(100f);

        System.out.println(conta1.saldo);

         */

        //COM O PRIVATE
        conta1.setSaldo(1000f);
        conta1.setTitular(cliente1);
        conta1.setNumero(1600);
        conta1.setLimite(10000f);

        conta1.sacar(100f);

        System.out.println(conta1.getSaldo());

        //Exercicio Poligono

        //Criando o Objeto
        PoligonoRegular poli1 = new PoligonoRegular();

        //Mandando o numero de lados e comprimento pelo metodo
        poli1.calculaAreaPoligono(4,3f);

        //Mostrando a area do poligono atraves do metodo
        System.out.println("Area do Poligono: " + poli1.getAreaPoligono() + "cm");

    }
}
