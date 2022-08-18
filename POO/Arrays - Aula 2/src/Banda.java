public class Banda {

    //Atributos Explicitos
    public String nome;
    public String genero;

    //Atributos Implicitos
    public Empressario empressario;
    public Musico[] musicos;
    public Musica[] musicas = new Musica[100];

    //Construtor
    public Banda(String s, String pop, Empressario empressario, Musico[] musicos) {
        this.nome = s;
        this.genero = pop;
        this.empressario = empressario;
        this.musicos = musicos;
        //this.musicas = musicas;
    }

    /*
    //Criando o Objeto Musica diretamente
    public void Musica(Musica musicas){
        this.musicas = new Musica[100];
    }
     */

    void mostraInfoBanda(){
        System.out.println("Banda: " + nome);
        if(empressario != null) {
            System.out.println("Dados dos Empressario");

            System.out.println("Nome: " + empressario.nome + "  Cnpj: " + empressario.cnpj);
        }
        System.out.println("Musicos: ");
        for(int i = 0; i < musicos.length; i++){
            if(musicos[i] != null)
                System.out.println(musicos[i].nome + " eh o " + musicos[i].funcao);
        }
        System.out.println("Musicas: ");
        for(int i = 0; i < musicas.length; i++){
            if(musicas[i] != null)
                System.out.println(musicas[i].nome + " de duracao " + musicas[i].tempo);
        }
        System.out.println("------------------------------");
    }
}
