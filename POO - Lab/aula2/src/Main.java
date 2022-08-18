import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double velocidade;
        Carro c1 = new Carro();

        c1.modelo = "Gol";
        c1.velocidade = 100;

        Scanner scanner = new Scanner(System.in);

        velocidade = scanner.nextDouble();

        if(velocidade < c1.velocidade)
            c1.frear(velocidade);
        else if(velocidade > c1.velocidade)
            c1.acelerar(velocidade);
        else
            System.out.println("A velocidade se manteve");




    }
}
