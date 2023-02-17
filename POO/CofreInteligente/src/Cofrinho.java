import java.util.*;

public class Cofrinho{
    private ArrayList<Moeda> moedas = new ArrayList<Moeda>();

    public void addMoeda(Moeda m){
        moedas.add(m);
    }
    public double getValorTotal(){
        double total = 0;
        for(int i = 0;i< moedas.size();i++){
            total = total + moedas.get(i).getValor();
        }
        return total;
    }

    public int getQuantMoedas(){
        return moedas.size();
    }

    public Moeda getMoedaMaiorValor(){
        return Collections.max(moedas);
    }

    public void ordenaMoedas(){
        System.out.print("Antes da Ordenacao: ");
        for(int i = 0;i < moedas.size();i++)
            System.out.print(moedas.get(i).getValor() + " ");
        Collections.sort(moedas);
        System.out.print("\nDepois da Ordenacao: ");
        for(int i = 0;i < moedas.size();i++)
            System.out.print(moedas.get(i).getValor() + " ");
    }

}
