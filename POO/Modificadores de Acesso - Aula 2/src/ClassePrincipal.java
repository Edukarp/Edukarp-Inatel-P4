public class ClassePrincipal {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Eduardo", "1128388328");

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        //Acessando o static(atributo de classe)(no caso esta public)
        Conta.totalContas++;

        Conta conta3 = new Conta(1234,1000f,cliente1);

        System.out.println(Conta.totalContas);

        //Fabrica de Robos

        Robo robo1 = new Robo(true);
        robo1.getCorpo().setTipo("PC1");
        robo1.getCorpo().setCor("Rosa");

        robo1.getProcessador().setMarca("Acer");
        robo1.getProcessador().setFrequenciaProcessamento(2400f);

        robo1.mostraConfigRobo();
    }
}
