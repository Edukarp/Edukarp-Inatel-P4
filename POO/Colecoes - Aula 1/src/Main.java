import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(34);
        System.out.println(numeros.get(0));
        System.out.println(numeros);

        List lista = new ArrayList();
        lista.add("Java");
        lista.add(77);
        lista.add("Phyton");
        lista.add(500.0f);
        System.out.println("Antes: "+ lista);
        //lista.add(5,"C++");

        System.out.printf("Depois : \n");
        for(int i = 0; i < lista.size();i++){
            if(lista.get(i) != null)
                System.out.println(lista.get(i));
        }

        List<String> faculdades = new ArrayList<String>();

        faculdades.add("Inatel");
        faculdades.add("ITA");
        faculdades.add("Unifei");
        faculdades.add("USP");
        faculdades.add("4");
        System.out.println("Nao Ordenado: " + faculdades);
        Collections.sort(faculdades); //So da pra usar em lista com tipo predefinido
        System.out.println("Ordenado: " + faculdades);

        //Crindo um arraylist de objetos

        Conta c1 = new Conta("Eduardo",12,3475.50f);
        Conta c2 = new Conta("Maria",4,8992.0f);
        Conta c3 = new Conta("Joao",1,5890.25f);

        ArrayList<Conta> contas = new ArrayList<Conta>();
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        System.out.println("Nao Ordenado: " + contas); //Aqui ta mostrando as posicoes de memoria
        Collections.sort(contas); //Ordenando pelo numero a partir do compareTo
        System.out.println("Ordenado: " + contas);
        //Collections.max(contas);

    }
}
