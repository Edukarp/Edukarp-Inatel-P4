import java.util.Date;

public class Ingresso {

    private static long numberGeneretor;
    protected static float taxaCartao;
    private long numero;
    protected float valorIngresso;
    protected Date dataHoraCompra;

    public Ingresso(){

    }

    public Ingresso(float valorIngresso){
        this.numero = numberGeneretor;;
        this.valorIngresso = valorIngresso;
        dataHoraCompra = new Date();
        dataHoraCompra.getTime();
        numberGeneretor++;
    }

    public float calculaTotalIngresso(){
        float total;
        total = valorIngresso + taxaCartao;

        return total;
    }

    public void mostraInfos(){
        System.out.println("Numero do Ingresso: " + numero);
        System.out.println("Valor do Ingresso: " + calculaTotalIngresso());
        System.out.println("Hora e Data da compra: " + dataHoraCompra);
    }

    public float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
}
