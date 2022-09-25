import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int acao;
        String nome;
        int k = 1;

        Scanner scanner = new Scanner(System.in);
        Carta[] carta = new Carta[50];
        Deck deck = new Deck();

        /*
        carta[1] = new Carta("Guerreiro",10,"soldado");
        carta[2] = new Carta("Arqueiro Basico",4,"arqueiro");
        carta[3] = new Carta("Cavalaria",19,"pesado");
        carta[4] = new Carta("Arqueiro Longo",8,"arqueiro");
         */
        //Adicionando Cartas Manualmente
        do{
            System.out.println("Painel de criacao de Cartas:");
            System.out.println("Digite 1 para criar uma carta e 0 para deixar o painel de criacao de cartas");
            acao = scanner.nextInt();
            if(acao == 1) {
                scanner.nextLine();
                carta[k] = new Carta();
                System.out.println("Digite o nome da Carta");
                carta[k].nome = scanner.nextLine();
                System.out.println("Digite o poder da Carta");
                carta[k].poder = scanner.nextInt();
                System.out.println("Digite a classe da Carta (soldado, arqueiro ou pesado");
                scanner.nextLine();
                carta[k].classificacao = scanner.nextLine();
                System.out.println("Carta de numero " + k + " criada!");
                k++;
            }

        }while(acao != 0);
        System.out.println("---------------------------------------------------------");
        //k =0;
        scanner.nextLine();
        //deck = new Deck("Eduardo")
        //Criando Deck Manualmente
        System.out.println("\nCrie seu Deck:");
        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
        deck.dono = nome;
        System.out.println("Dono: " + deck.dono);

        do{
            System.out.println("Painel de criacao de Deck");
            System.out.println("Digite 1 para Adicionar uma carta ao Deck 0 para deixar o painel de criacao de deck");
            acao = scanner.nextInt();
            if(acao == 1) {
                System.out.println("Digite o numero da carta que quer adiconar de 1 a " + carta.length);
                k = scanner.nextInt();
                deck.adicionarCarta(carta[k]);
            }
        }while(acao != 0);
        System.out.println("---------------------------------------------------------");

        do{
            System.out.println("\nPainel de Informacoes");
            System.out.println("Digite 1 para ver detalhes do Deck");
            System.out.println("Digite 2 para o poder do Deck");
            System.out.println("Digite 3 para ver classificacao de cartas do Deck");
            System.out.println("Digite 0 para ver finalizar");
            acao = scanner.nextInt();
            if(acao == 1)
                deck.mostrarInfo();
            else if(acao == 2)
                deck.calculaPoderMedio();
            else if(acao == 3)
                deck.calculaClassificacao();

        }while(acao != 0);
    }
}
