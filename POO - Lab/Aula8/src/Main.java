public class Main {
    public static void main(String[] args) {

        //Criando Professor
        Professor p1 = new Professor("Eduardo", "Edu","1234");
        p1.fazerLogin("Edu","1234");
        p1.fazerLogin("Eu","1234"); //Errando usuario
        p1.fazerLogin("Edu","123"); //Errando senha

        //Criando Aluno
        Aluno a1 = new Aluno(77,"Software");
        a1.criaLogin("Eduu","1234");
        a1.mostraInfos();

    }
}
