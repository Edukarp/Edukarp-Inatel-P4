import java.util.Random;
import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {

        int numEscolhido;
        int numAleatorio;

        Random randomGenerator = new Random(); //Criando a classe pra gerar o num aleatorio
        numAleatorio = randomGenerator.nextInt(10)+1; //Gerando um num aleatorio de 1 a 10

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 10:");
        do {
            numEscolhido = leitor.nextInt();
            if(numEscolhido < numAleatorio)
                System.out.println("O numero eh maior");
            else if (numEscolhido > numAleatorio){
                System.out.println("O numero eh menor");
            }
        }while (numEscolhido != numAleatorio);
        System.out.println("Parabens vc adivinhou!");
    }
}
