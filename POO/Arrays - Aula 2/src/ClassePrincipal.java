public class ClassePrincipal {

    public static void main(String[] args) {

        //Criando Musicos
        Musico[] musicos = new Musico[10];
        musicos[0] = new Musico();
        musicos[0].nome = "Musico1";
        musicos[0].funcao = "Baterista";
        musicos[1] = new Musico();
        musicos[1].nome = "Musico2";
        musicos[1].funcao = "Vocalista";

        //Criando Empressarios
        Empressario empressario = new Empressario();
        empressario.cnpj = 111333224;
        empressario.nome = "Empressario";

        //Criando a Banda e suas Musicas
        Banda banda1 = new Banda("Banda!","Pop",empressario, musicos); //Utilizando o construtor
       // banda.nome = "Banda!";
        // banda.genero = "Pop";

        banda1.musicas[0] = new Musica();
        banda1.musicas[0].nome = "Musica1";
        banda1.musicas[0].tempo = "3:10";
        banda1.musicas[1] = new Musica();
        banda1.musicas[1].nome = "Musica2";
        banda1.musicas[1].tempo = "2:45";

        banda1.mostraInfoBanda();
    }
}
