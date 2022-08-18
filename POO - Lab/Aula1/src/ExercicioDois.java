import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        float nota1;
        float nota2;
        float nota3;
        float notaTotal;
        float media;

        Scanner leitor = new Scanner(System.in);

        nota1 = leitor.nextFloat();
        nota2 = leitor.nextFloat();
        nota3 = leitor.nextFloat();

        notaTotal = (nota1*2)+(nota2*3)+(nota3*5);
        media = notaTotal/10f;

        System.out.println("Media do Aluno: " + media);

    }
}
