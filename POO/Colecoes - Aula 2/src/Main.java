import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Set é um conjunto = nao tem ordem e nao tem elementos repetidos
        Set<String> linguagens = new HashSet<String>();

        linguagens.add("Phyton");
        linguagens.add("Java");
        linguagens.add("C++");
        linguagens.add("C#");
        linguagens.add("Java");

        System.out.println(linguagens);

        //Nao possui um index padrao necessita de uma chave
        Map<Integer, String> alunos = new HashMap<Integer, String>();
        alunos.put(77,"Eduardo Karpfenstein");
        System.out.println(alunos.get(77));
        alunos.put(23, "haushuhas");
        System.out.println(alunos);

        //Teste de Velociade de Cada tipo
        CollectionsSpeed velocidade = new CollectionsSpeed();
        System.out.println("\nInsercao:");
        velocidade.insereLista();
        velocidade.insereConjunto();
        velocidade.insereMapa();

        System.out.println("\nLeitura:");
        velocidade.lerLista();
        velocidade.lerConjunto();
        velocidade.lerMapa();
    }
}
