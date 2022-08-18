import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {

        int numero;
        int cont = 0;

        Scanner leitor = new Scanner(System.in);

        numero = leitor.nextInt();

        for(int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                cont++;
            }
        }
        System.out.println(cont + " Numeros impares");
    }
}
