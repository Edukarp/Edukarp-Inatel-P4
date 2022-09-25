public class Camarote extends Ingresso{

    private String tamCamiseta;

    public Camarote(){

    }

    public Camarote(float valorIngresso, String tamCamiseta) {
        super(valorIngresso);
        this.tamCamiseta = tamCamiseta;
    }

    @Override
    public void mostraInfos() {
        super.mostraInfos(); //Com o prefixo "super"(classe mae)permite nao sobreescrever o metodo e sim complementar
        System.out.println("Tipo: Camarote");
        System.out.println("Tamanho da Camiseta: " + tamCamiseta);
    }

    public String getTamCamiseta() {
        return tamCamiseta;
    }

    public void setTamCamiseta(String tamCamiseta) {
        this.tamCamiseta = tamCamiseta;
    }
}
