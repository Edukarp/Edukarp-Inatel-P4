package br.inatel.SimuVoto.controller;
import br.inatel.SimuVoto.model.*;

import java.util.regex.*;

import java.util.ArrayList;

public class Apuracao {

    private ArrayList<Candidato> candidatos = new ArrayList<>();
    private ArrayList<Eleitor> eleitores = new ArrayList<>();
    private static int errorCheck = 0;
    private static int maiorNumVotos = -9999;
    int aux;

    Pattern cpfPadrao = Pattern.compile("[0-9]{3}[.][0-9]{3}[.][0-9]{3}-[0-9]{2}", Pattern.CASE_INSENSITIVE);
    Matcher cpfUsuario;

    public void addCandidatos(Candidato candidato){
        candidatos.add(candidato);
    }

    public void addVoto(Eleitor eleitor){
        try {
            cpfUsuario = cpfPadrao.matcher(eleitor.getCpf());
            boolean matchFound = cpfUsuario.find();
            if(matchFound) {
                for (int i = 0; i < candidatos.size(); i++) {
                    if (eleitor.getVoto() == candidatos.get(i).getNumero()) {
                        candidatos.get(i).getVotos().add(eleitor.getCpf());
                        errorCheck = 1;
                    }
                }
            }
            else
                throw new DadosIncorretosException("Cpf Incorreto, tente novamente! (Padrao: xxx.xxx.xxx-xx)");
            if (errorCheck == 0)
                throw new DadosIncorretosException("Numero do Candidato Incorreto, tente novamente!");
            else
                eleitores.add(eleitor);
        }catch (DadosIncorretosException e){
            System.err.println(e.getMessage());;
        }
        errorCheck = 0;
    }

    public void contaVoto(){
        int[] numVotos = new int[candidatos.size()];
        for(int i = 0; i < candidatos.size();i++) {
            //System.out.println("Candidato " + (i + 1) + ": " + candidatos.get(i).getVotos().size());
            numVotos[i] = candidatos.get(i).getVotos().size();
            FileManager.writeTxt("src/br/inatel/SimuVoto/view/"+candidatos.get(i).getNome()+".txt", candidatos.get(i).converteInfo() +"\nTotal de Votos: "+numVotos[i]);
            FileManager.readTxt("src/br/inatel/SimuVoto/view/"+candidatos.get(i).getNome()+".txt");
            System.out.println();
        }
        for(int i = 0; i < candidatos.size();i++) {
            if(numVotos[i] > maiorNumVotos) {
                maiorNumVotos = numVotos[i];
                aux = i;
            }
        }
        System.out.println("\n---------------------------------------------------");
        System.out.println("O Vencedor foi o Candidato: " + candidatos.get(aux).getNome());
        System.out.println("---------------------------------------------------");
    }
}
