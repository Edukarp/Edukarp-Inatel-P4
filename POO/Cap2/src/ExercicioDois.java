import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {

        String elemento;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o Tipo: ");
        elemento = leitor.nextLine();

        switch (elemento){
            case "Fogo":
                System.out.println("Fraqueza: Agua");
                break;
            case "Agua":
                System.out.println("Fraqueza: Eletricidade");
                break;
            case "Eletricidade":
                System.out.println("Fraqueza: Pedra");
                break;
            case "Pedra":
                System.out.println("Fraqueza: Gelo");
                break;
            case "Gelo":
                System.out.println("Fraqueza: Fogo");
                break;
            case "Planta":
                System.out.println("Fraqueza: Fogo");
                break;
            default:
                System.out.println("Tipo nao reconhecido");
        }
    }

}
