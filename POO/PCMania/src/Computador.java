public class Computador {

    //Declarando variaveis
    //Explicitas
    public String marca;
    public float preco;

    //Implicitas
    //public SistemaOperacional system = new SistemaOperacional();
    public SistemaOperacional system;

    public HardwareBasico[] hardware;

    public Cliente[] cliente;
    public MemoriaUSB memoria;

    //Criando Contrutor
    public Computador(String marca, float preco){
        this.marca = marca;
        this.preco = preco;
        hardware = new HardwareBasico[10];
        system = new SistemaOperacional();
}
    //Realizando acoes
    public void mostraPCConfigs(){
        System.out.println("--------------------------------------------");
        System.out.println("Configuracoes do PC: " + marca);
        System.out.println("Sistema Operacional: " + system.nome + " de " + system.tipo + " bits");
        for(int i = 0; i < hardware.length; i++) {
            if (hardware[i] != null){
                if (hardware[i].capacidade <= 3)
                    System.out.println(hardware[i].nome + " com capacidade de: " + hardware[i].capacidade + " Tb");
                else if (hardware[i].capacidade >= 1000)
                    System.out.println(hardware[i].nome + " com capacidade de: " + hardware[i].capacidade + " Mhz");
                else
                    System.out.println(hardware[i].nome + " com capacidade de: " + hardware[i].capacidade + " Gb");
            }
        }
        System.out.println("Preco: R$" + preco);
        if(memoria != null){
            if(memoria.capacidade == 1)
                System.out.println("Acompanha um: " + memoria.nome + " com capacidade de: " + memoria.capacidade + " Tb");
            else
                System.out.println("Acompanha um: " + memoria.nome + " com capacidade de: " + memoria.capacidade + " Gb");
        }
        System.out.println("--------------------------------------------");
    }

    public void addMemoriaUSB(MemoriaUSB memoria){ //Adicionando a Memoria Externa caso haja
        this.memoria = memoria;
    }




}
