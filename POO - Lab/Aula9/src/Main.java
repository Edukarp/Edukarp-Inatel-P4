import java.util.*;

public class Main {
    public static void main(String[] args) {

        //ArrayList
        System.out.println("------------------------------------");
        System.out.println("ArrayList\n");

        //Pode ser List aqui
        ArrayList<String> frutas = new ArrayList<String>(); //Tamanho Dinamico
        //Adicionando valroes no arraylist
        frutas.add("maça");
        frutas.add("banana");
        frutas.add(2,"morango");

        System.out.println(frutas);
        System.out.println(frutas.get(1));
        frutas.set(0,"laranja"); //Vai remover a maça e adicionar laranja
        frutas.remove(0); //Vai remover o maça e assim mover pra tras o array
        System.out.println(frutas);
        System.out.println(frutas.size()); //Tamanho da Array =List


        //HashMap
        System.out.println("------------------------------------");
        System.out.println("HashMap\n");

        //Pode ser Map aqui
        HashMap<Integer,String> mapa1 = new HashMap<Integer,String>(); //Guarda duas 'chaves' em um indice(o primeiro sempre)
        mapa1.put(20,"Eduardo"); //O primeiro é o indice (ou seja nesse caso o 20)
        mapa1.put(31,"Maria");

        System.out.println(mapa1);
        System.out.println(mapa1.get(20)); //Usando o Integer como indice
        //!!size, remove e clear iguais ao ArrayList

        for(Integer inteiro : mapa1.keySet())//For Each pra varrer o HashMap
            System.out.println(inteiro); //Mostrando os indices


        //HashSet
        System.out.println("------------------------------------");
        System.out.println("HashSet\n");

        //Pode ser Set aqui
        HashSet<String> vegetais = new HashSet<String>(); //Cada item é UNICO e NAO tem indice (ordem aleatoria)

        vegetais.add("Cenoura");
        vegetais.add("Espinafre");
        vegetais.add("Cenoura"); //Mesmo tendo armazenado cenoura duas vezes só vai aparecer uma
        vegetais.add("Couve");
        vegetais.add("Rabanete");
        System.out.println(vegetais);
        System.out.println(vegetais.contains("Aipim")); //Verificando se há no HashSet


        //Iterator
        System.out.println("------------------------------------");
        System.out.println("iterator\n");

        Iterator<String> it = frutas.iterator();//Serve pra varrer qualquer tipo de Colecao
        System.out.println(it.next()); //Pegando o primeiro valor (lembrando que maca foi removido la em cima)

        it = vegetais.iterator();
        System.out.println(it.next()); //Aqui sempre vai ser um primeiro aletorio pela falta de indice do HashSet


        //Exercicio
        System.out.println("------------------------------------");
        System.out.println("Exercicio\n");

        Empresa e1 = new Empresa("Inatel", "12234356");
        Funcionario f1 = new Funcionario("Edu","112233434",2000);
        Funcionario f2 = new Funcionario("Maria","21323345", 2000);

        e1.addDepartamento("dept1", 8000);
        e1.addDepartamento("dept2",4000);

        e1.addFuncionario(f1);
        e1.addFuncionario(f2);

        e1.listarFuncionarios();
        e1.listarDepartamentos();

        e1.mostrarInfo();

    }
}
