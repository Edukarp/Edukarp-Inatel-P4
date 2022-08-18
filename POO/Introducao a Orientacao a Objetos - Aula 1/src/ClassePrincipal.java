import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {
        //Para se criar um obj usa-se "new"
        //Para acessar este obj, deve-se criar um ponteiro pra ele

        Pessoa p1 = new Pessoa();
        p1.nome = "Eduardo";
        p1.idade = 20;
        p1.cpf = "123.456.789-12";
        //Questao da prova = "new Pessoa" cria o objeto mas nao deixa manipular ate a criacao do ponteiro (p1 no caso)

        Pessoa p2 = new Pessoa();
        p2.nome = "Matheus";
        p2.idade = 20;
        p2.cpf = "456.789.123-45";

        Pessoa p3 = new Pessoa();
        p3.nome = "Beatriz";
        p3.idade = 20;
        p3.cpf = "312.654.987-01";

        p1.comer();
        p2.tomarAgua();
        p3.dormir();

        int tempo;
        int distancia;

        Scanner cin = new Scanner(System.in);

        AnimalPet a1 = new AnimalPet();
        a1.nomePet = "Pantera";
        a1.especie = "Cachorro";
        a1.som = "Au Au";
        a1.comida = "Carne";
        a1.idadePet = 6;

        AnimalPet a2 = new AnimalPet();
        a2.nomePet = "Safira";
        a2.especie = "Gato";
        a2.som = "Miau";
        a2.comida = "Racao";
        a2.idadePet = 8;

        System.out.println("Digite o horario dormido e a distancia percorrida pelo pet" + a1.nomePet);
        tempo = cin.nextInt();
        distancia = cin.nextInt();

        a1.dormirPet(tempo);
        a1.comerPet();
        a1.movimentarPet(distancia);
        a1.fazerBarulho();

        System.out.println("Digite o horario dormido e a distancia percorrida pelo pet" + a2.nomePet);
        tempo = cin.nextInt();
        distancia = cin.nextInt();

        a2.dormirPet(tempo);
        a2.comerPet();
        a2.movimentarPet(distancia);
        a2.fazerBarulho();

    }
}
