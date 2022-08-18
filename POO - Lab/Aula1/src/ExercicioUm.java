import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {

        float raio;
        float areaCircunferencia;

        Scanner leitor = new Scanner(System.in);

        raio = leitor.nextFloat();

        areaCircunferencia = 3.14f*raio*raio;

        System.out.println("Area da Circunferencia: " + areaCircunferencia);


    }
}
