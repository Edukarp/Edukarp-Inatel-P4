import java.util.Date;

public class Robo {

    private static long serialNumberGenerator;
    private long serialNumber;
    private Date dataCriacao = new Date();
    private Processador processador;
    private Corpo corpo;

    public Robo(boolean temProcessador){
        serialNumberGenerator++;
        serialNumber = serialNumberGenerator;
        if(temProcessador) {
            processador = new Processador();
        }
        corpo = new Corpo();
        dataCriacao.getTime();
    }

    public void mostraConfigRobo(){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Serial: " + serialNumber + "        Tipo: " + corpo.getTipo());
        System.out.println("Data de Fabricacao: " + dataCriacao);
        System.out.println("Modelo: " + processador.getMarca() + "    Cor: " + corpo.getCor());
        System.out.println("Processador de Frequencia: " + processador.getFrequenciaProcessamento() + "Hz");
        System.out.println("-----------------------------------------------------------------");
    }

    public Processador getProcessador() {
        return processador;
    }

    public Corpo getCorpo() {
        return corpo;
    }
}
