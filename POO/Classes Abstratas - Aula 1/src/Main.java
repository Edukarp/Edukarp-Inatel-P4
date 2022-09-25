public class Main {
    public static void main(String[] args) {

        Unidade[] unidades = new Unidade[10];//Abstratas podem ser chamadas em arrays ja que nao esta criando um obj

        unidades[0] = new UnidadeBH();
        unidades[0].setEndereco("endereco0");
        unidades[0].setNomeResponsavel("nome0");
        unidades[0].mostraPizza();

        unidades[1] = new UnidadeRJ();
        unidades[1].setEndereco("endereco1");
        unidades[1].setNomeResponsavel("nome1");
        unidades[1].mostraPizza();

        unidades[2] = new UnidadeSP();
        unidades[2].setEndereco("endereco2");
        unidades[2].setEndereco("nome2");
        unidades[2].mostraPizza();

        Pizza pizza1 = new Pepperoni();
        pizza1.setPreco(15f);
        pizza1.mostraIngredientes();
        System.out.println("Brinde: " + pizza1.mostraBrinde());

        Pizza pizza2 = new Brasileira();
        pizza2.setPreco(20f);
        pizza2.mostraIngredientes();
        System.out.println("Brinde: " + pizza2.mostraBrinde());

        Pizza pizza3 = new Supreme();
        pizza3.setPreco(25f);
        pizza3.mostraIngredientes();
        System.out.println("Brinde: " + pizza3.mostraBrinde());

    }
}
