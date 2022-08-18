import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args){ //psvm + enter

        //Criando um tipo Primitivo
        int idade = 20;

        //Criando uma Classe (Inicio Maiusculo)
        String nome = "Eduardo";

        //Percebe-se 'System' é uma classe tambem
        System.out.println("Nome: " + nome + " Idade: " + idade); //sout + enter

        System.out.println(nome.toUpperCase()); //Tudo maiusculo
        System.out.println(nome.toLowerCase()); //Tudo minusculo
        System.out.println(nome.length()); //Quantidade de caracteres

        //Casting igual C++
        long x = 10000;
        int i = (int) x;

        //Inserindo Dados (cin)
        Scanner leitor = new Scanner(System.in);//Se precisar, dar import no Scanner
        System.out.println("Entre com o nome:");
        nome = leitor.nextLine(); //Inserir String
        //nome = leitor.nextInt(); Inserir Inteiro
        //nome = leitor.nextFloat(); Inserir Float e etc...

        System.out.println("Nome Mesmo: " + nome);

    }
}
