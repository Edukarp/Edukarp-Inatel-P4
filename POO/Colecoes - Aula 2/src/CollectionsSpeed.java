import java.util.*;

public class CollectionsSpeed {

    long tempIncio = 0;
    long tempFinal = 0;
    static int numElementos = 200000;
    ArrayList<Integer> lista = new ArrayList<>();
    HashSet<Integer> conjunto = new HashSet<>();
    HashMap<Integer, Integer> mapa = new HashMap<>();

    public void insereLista(){
        tempIncio = System.currentTimeMillis();
        for(int i = 0;i< numElementos;i++)
            lista.add(i);
        tempFinal = System.currentTimeMillis();
        System.out.println("Tempo de Insercao da Lista: " + (tempFinal - tempIncio));
    }
    public void insereConjunto(){
        tempIncio = System.currentTimeMillis();
        for(int i = 0;i< numElementos;i++)
            conjunto.add(i);
        tempFinal = System.currentTimeMillis();
        System.out.println("Tempo de Insercao do Conjunto: " + (tempFinal - tempIncio));
    }

    public  void insereMapa(){
        tempIncio = System.currentTimeMillis();
        for(int i = 0;i< numElementos;i++)
            mapa.put(i, i);
        tempFinal = System.currentTimeMillis();
        System.out.println("Tempo de Insercao do Mapa: " + (tempFinal - tempIncio));
    }

    public void lerLista(){
        tempIncio = System.currentTimeMillis();
        for(int i = 0;i< lista.size();i++)
            lista.get(i);
        tempFinal = System.currentTimeMillis();
        System.out.println("Tempo de Leitura da Lista: " + (tempFinal - tempIncio));
    }

    public void lerConjunto(){
        tempIncio = System.currentTimeMillis();
        for (Integer v:conjunto) {
        }
        tempFinal = System.currentTimeMillis();
        System.out.println("Tempo de Leitura do Conjunto: " + (tempFinal - tempIncio));
    }

    public void lerMapa(){
        tempIncio = System.currentTimeMillis();
        for(int i = 0;i<mapa.size();i++)
            mapa.get(i);
        tempFinal = System.currentTimeMillis();
        System.out.println("Tempo de Leitura do Mapa: " + (tempFinal - tempIncio));
    }

}
