public class Deck {
    public String dono;
    public Carta[] cartas;

    public int maxCartas = 1;


    public Deck(String dono){
        this.dono = dono;
    }

    public Deck() {

    }

    public void adicionarCarta(Carta carta){
        if(cartas != null) {
            this.cartas[maxCartas] = carta;
            maxCartas++;
        }
    }

    public void mostrarInfo(){
        System.out.println("Dono do Deck: " + dono);
        System.out.println("Cartas: ");
        for(int i = 1; i <= maxCartas; i++){
            if(cartas[i] != null){
                System.out.println("Carta " + i);
                System.out.println("Nome: " + cartas[i].nome + "  Poder:" + cartas[i].poder + "  Classificacao: " + cartas[i].classificacao);
            }
        }
    }

    public void calculaPoderMedio(){
        int poderMedio = 0;
        int i;
        for(i = 1; i<= maxCartas; i++){
            if(cartas[i] != null) {
                poderMedio = poderMedio + cartas[i].poder;
            }
        }
        System.out.println("Poder Total: " + poderMedio);
        System.out.println("Poder Medio: " + poderMedio/i);
    }

    public void calculaClassificacao(){
        int qntSoldado = 0;
        int qntArqueiro = 0;
        int qntPesado = 0;
        for(int i = 1; i<= cartas.length; i++){
            if(cartas != null) {
                if(cartas[i].classificacao.equals("soldado"))
                    qntSoldado++;
                else if(cartas[i].classificacao.equals("arqueiro"))
                    qntArqueiro++;
                else
                    qntPesado++;

            }
        }
        System.out.println("No Deck há: " + qntSoldado + " Soldados, " + qntArqueiro + " Arqueiros e " + qntPesado + " Pesados");
    }

}
