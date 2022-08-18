import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {

        int ano1, ano2, ano3; //Variaveis quantidade de viloes
        int total;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Numero de apreensoes no ano 1: ");
        ano1 = leitor.nextInt();

        System.out.println("Numero de apreensoes no ano 2: ");
        ano2 = leitor.nextInt();

        System.out.println("Numero de apreensoes no ano 3: ");
        ano3 = leitor.nextInt();

        total = ano1+ano2+ano3;

        //Ver o /n do C (nao precisaria usar necessariamente printf)
        System.out.printf("Apreensoes:" + "Ano 1: %d, Ano 2: %d, Ano 3: %d \n",ano1,ano2,ano3);
        System.out.println("Apreensoes Totais: " + total);

    }
}
