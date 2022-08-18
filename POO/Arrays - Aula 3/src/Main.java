import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declarando as variaveis linha e coluna
        int linha;
        int coluna;

        //Pontuacao caso nao acerte a bomba
        int pontos = 0;

        //Criando a Matriz (no exercicio 3x3)
        int[][] matrix = new int[3][3];

        //Selecionando aleatoriamente uma posicao da MAtriz
        Random numeroAleatorio = new Random();
        linha = numeroAleatorio.nextInt(2);//limite de 0 a 2
        coluna = numeroAleatorio.nextInt(2);

        //Posicao da Matriz recebendo a bomba
        matrix[linha][coluna] = 1;

        //Fazendo o Campo Minado
        System.out.println("Campo Minado!");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Entre com as Posicoes... ");
            System.out.println("Linha: ");
            linha = scanner.nextInt();
            System.out.println("Coluna: ");
            coluna = scanner.nextInt();

            if(matrix[linha][coluna] == 1){
                System.out.println("BOOM!!! Game Over");
                System.out.println("Pontuacao Final: " + pontos + " ponto(s).");
                break;
            }
            else if(matrix[linha][coluna] == 0){
                System.out.println("Pontuou!  Pontuacao: " + pontos);
                matrix[linha][coluna] = 2;
                pontos++;
            }
            else
                System.out.println("Posicao ja selecionada...");

        }while(pontos != 8);

        if(pontos == 8)
            System.out.println("Pontuacao Maxima, Parabens!!!");
    }
}
