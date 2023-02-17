import br.inatel.SimuVoto.controller.Apuracao;
import br.inatel.SimuVoto.controller.DadosIncorretosException;
import br.inatel.SimuVoto.model.Candidato;
import br.inatel.SimuVoto.model.Eleitor;

public class Main {
    public static void main(String[] args) {

        Candidato c1 = new Candidato("Paulinho Anao","112.222.567-00" ,77);
        Candidato c2 = new Candidato("Rogerao","562.902.467-39" ,51);
        Candidato c3 = new Candidato("Darth Verde","172.234.987-80" ,43);

        Eleitor e1 = new Eleitor("119.993.796-75",51);
        Eleitor e2 = new Eleitor("622.488.780-05",77);
        Eleitor e3 = new Eleitor("113.192.497-90",51);
        Eleitor e4 = new Eleitor("1234567890",43);
        Eleitor e5 = new Eleitor("375.992.875-32",55);

        Apuracao apuracao = new Apuracao();

        apuracao.addCandidatos(c1);
        apuracao.addCandidatos(c2);
        apuracao.addCandidatos(c3);

        apuracao.addVoto(e5);
        apuracao.addVoto(e1);
        apuracao.addVoto(e2);
        apuracao.addVoto(e3);
        apuracao.addVoto(e4);

        apuracao.contaVoto();

    }
}
