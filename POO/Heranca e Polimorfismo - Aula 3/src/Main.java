public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras cliente1 = new CarrinhoDeCompras("Eduardo");

        Ingresso[] ingressos = new Ingresso[100];

        ingressos[0] = new Vip(300f,"M");
        //ingressos[0].setValorIngresso(300f);
        cliente1.addIngresso(ingressos[0]);

        ingressos[1] = new Camarote(350f,"G");
        //ingressos[1].setValorIngresso(350f);
        cliente1.addIngresso(ingressos[1]);

        ingressos[2] = new Kids(200f,"PP","129.344.567-64");
        cliente1.addIngresso(ingressos[2]);

        cliente1.mostraDetalhesCompra();
    }
}
