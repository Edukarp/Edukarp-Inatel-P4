import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int acao1, acao2; //Define o que o Usuario ira fazer
        int j = 0; //Contador de Clientes (caso houvesse)
        int compra = 0; //Contador da Compra de PCs
        float valor = 0;//Valor que vai receber o total da compra
        Computador[] guardaCompra = new Computador[50]; //fazendo um vetor de PCs para guardar as compras
        //String nome, String cpf -> Caso usasse o Scanner para colocar clientes
        Scanner scanner = new Scanner(System.in);

        //Criando os Computadores e suas Promocoes
        Computador promo1 = new Computador("Positivo", 1300);
        promo1.hardware[0] = new HardwareBasico("Pentium Core i3",1200f);
        promo1.hardware[1] = new HardwareBasico("Memoria RAM", 4f);
        promo1.hardware[2] = new HardwareBasico("HD", 500f);
        promo1.system = new SistemaOperacional("Linux Ubuntu",32);
        MemoriaUSB mem1 = new MemoriaUSB("Pen-drive", 16);
        promo1.addMemoriaUSB(mem1);

        Computador promo2 = new Computador("Acer",1800);
        promo2.hardware[0] = new HardwareBasico("Pentium Core i5", 2260f);
        promo2.hardware[1] = new HardwareBasico("Memoria RAM", 8f);
        promo2.hardware[2] = new HardwareBasico("HD", 1f);
        promo2.system = new SistemaOperacional("Windows 8",64);
        MemoriaUSB mem2 = new MemoriaUSB("Pen-drive", 32);
        promo2.addMemoriaUSB(mem2);

        Computador promo3 = new Computador("Vaio",2800);
        promo3.hardware[0] = new HardwareBasico("Pentium Core i7", 3500f);
        promo3.hardware[1] = new HardwareBasico("Memoria RAM", 16f);
        promo3.hardware[2] = new HardwareBasico("HD", 2f);
        promo3.system = new SistemaOperacional("Windows 10",64);
        MemoriaUSB mem3 = new MemoriaUSB("HD Externo", 1);
        promo3.addMemoriaUSB(mem3);

        //Criando Clientes e Iniciando Compra
        System.out.println("Bem vindo a PC Mania!!");
        Cliente[] cliente = new Cliente[100];
        //NOTA: Aqui colocaria um loop com Scanner para varrer as informacoes de cada cliente antes antes
        //nome = scanner.nextLine(), cpf = scanner.nextLine()
        //cliente[j] = new Cliente(nome,cpf);
        cliente[j] = new Cliente("Eduardo",1112223334);
        do{
            System.out.println("                                        Cliente: " + cliente[j].nome);
            System.out.println("Digite 1 -> Para Verificar a nossa Promocao 1");
            System.out.println("Digite 2 -> Para Verificar a nossa Promocao 2");
            System.out.println("Digite 3 -> Para Verificar a nossa Promocao 3");
            System.out.println("Digite 0 -> Para Finalizar Sessao");
            acao1 = scanner.nextInt();
            do{
                if(acao1 == 0)
                    break;
                System.out.println("Voce Selecionou a Promocao " + acao1);
                System.out.println("Digite 1 -> para ver as Configuracoes do PC");
                System.out.println("Digite 2 -> para Comprar o PC");
                System.out.println("Digite 3 -> para voltar as opcoes de Compra");
                acao2 = scanner.nextInt();
                if(acao2 == 1){
                    if(acao1 == 1)
                        promo1.mostraPCConfigs();
                    else if(acao1 == 2)
                        promo2.mostraPCConfigs();
                    else
                        promo3.mostraPCConfigs();
                }
                else if(acao2 == 2) {
                    if(acao1 == 1) {
                        guardaCompra[compra] = promo1;
                        cliente[j].comp = promo1;
                        valor = valor + cliente[j].calculaTotalCompra();
                        compra++;
                    }
                    else if(acao1 == 2) {
                        guardaCompra[compra] = promo2;
                        cliente[j].comp = promo2;
                        valor = valor + cliente[j].calculaTotalCompra();
                        compra++;
                    }
                    else {
                        guardaCompra[compra] = promo3;
                        cliente[j].comp = promo3;
                        valor = valor + cliente[j].calculaTotalCompra();
                        compra++;
                    }
                    System.out.println("PC adicionado a Compra");
                }
            }while(acao2 != 3);

        }while(acao1 != 0);

        //Finalizando Compra
        System.out.println("\n Cliente: " + cliente[j].nome + " de CPF: " + cliente[j].cpf + "  Comprou: ");
        for(int i = 0; i < guardaCompra.length; i++){
            if(guardaCompra[i] != null){
                guardaCompra[i].mostraPCConfigs();
            }
        }
        System.out.println("\nCompra Finalizada, Total: R$" + valor);
        System.out.println("Muito Obrigado por comprar na PC Mania volte sempre!");
        j++;//Aqui se houvesse o loop Adicionaria +1 e iria para o prox cliente
        compra = 0; //Resetando compra para o proximo Cliente (caso houvesse)

    }
}
