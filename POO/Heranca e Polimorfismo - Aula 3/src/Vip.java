public class Vip extends Ingresso{

    protected String tamAbada;

    public Vip(){

    }

    public Vip(float valorIngresso, String tamAbada) {
        super(valorIngresso);
        this.tamAbada = tamAbada;
    }
    @Override
    public void mostraInfos() {
        super.mostraInfos(); //Com o prefixo "super" ele nao vai sobreescrever e sim complementar
        System.out.println("Tipo: VIP");
        System.out.println("Tamanho do Abada: " + tamAbada);
    }

    public String getTamAbada() {
        return tamAbada;
    }

    public void setTamAbada(String tamAbada) {
        this.tamAbada = tamAbada;
    }
}
