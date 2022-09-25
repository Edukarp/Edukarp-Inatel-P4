public class Kids extends Vip{

    private String docResponsavel;

    public Kids(){

    }

    public Kids(float valorIngresso, String tamAbada, String docResponsavel) {
        super(valorIngresso, tamAbada);
        this.docResponsavel = docResponsavel;
    }
    @Override
    public void mostraInfos() {
        super.mostraInfos(); //Com o prefixo "super" ele nao vai sobreescrever e sim complementar
        System.out.println("SubTipo: Kids");
        System.out.println("Documento do Responsavel: " + docResponsavel);
    }

    public String getDocResponsavel() {
        return docResponsavel;
    }

    public void setDocResponsavel(String docResponsavel) {
        this.docResponsavel = docResponsavel;
    }
}
