import java.io.*;
import java.util.ArrayList;

public class Fabrica {

    ArrayList<Crianca> criancas = new ArrayList<>();
    ArrayList<Elfo> elfos = new ArrayList<>();
    ArrayList<Crianca> listaBonzinhos = new ArrayList<>();

    static int numCriancas = 0;
    static int numBozainhas = 0;

    public void novoElfo(Elfo elfo){
        elfos.add(elfo);
    }
    public void novaCrianca(Crianca crianca){
        criancas.add(crianca);
        String dados_c = crianca.converteInfo();
        FileManager.writeTxt("Docs/Criancas/c"+numCriancas+".txt", dados_c);
        numCriancas++;
    }

    public void addBonzinho(String nomeCrianca){
        for(int i = 0; i < criancas.size();i++) {
            if (criancas.get(i).getNome() == nomeCrianca) {
                listaBonzinhos.add(criancas.get(i));
                FileManager.writeTxt("Docs/Boazinhas/b"+numBozainhas+".txt",criancas.get(i).converteInfo());
                numBozainhas++;
            }
        }
    }

    public void listarBonzinhos(){
        if(listaBonzinhos.isEmpty())
            throw new SemBonzinhosException("Nao ha Bonzinhos na Lista esse ano :(");
        else {
            for (int i = 0; i < numBozainhas; i++)
                FileManager.readTxt("Docs/Boazinhas/b" +i+ ".txt");
        }
    }
}
