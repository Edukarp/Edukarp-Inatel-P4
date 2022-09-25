public class CarrinhoDeCompras {
    private String loginCliente;

    private Ingresso[] ingressos = new Ingresso[10];
    private static int qntIngressos;

    public CarrinhoDeCompras(String loginCliente) {
        this.loginCliente = loginCliente;
        qntIngressos = 0;
    }

    public void addIngresso(Ingresso ingressos){
        this.ingressos[qntIngressos] = new Ingresso();
        this.ingressos[qntIngressos] = ingressos;
        qntIngressos++;

        /*OU Sem Static
        for (int i = 0;i < ingressos.length ;i++){
         if(ingressos[i] == null){
            ingressos[i] = ingressos
            break;
         }
        }
         */
    }

    public void mostraDetalhesCompra(){
        float valorTotal = 0;
        System.out.println("-----------------------------------------");
        System.out.println("Cliente " + loginCliente + "  Ingressos:");
        for (int i = 0;i < ingressos.length ;i++){
            if(ingressos[i] != null){
                ingressos[i].mostraInfos();
                valorTotal = ingressos[i].calculaTotalIngresso() + valorTotal;
                System.out.println("-----------------------------------------");
            }
        }
        System.out.println("Total da Compra: " + valorTotal);
        System.out.println("-----------------------------------------");
    }
}
