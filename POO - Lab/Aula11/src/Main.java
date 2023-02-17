import br.inatel.aula11.controller.FileManager;
import br.inatel.aula11.model.Funcionario;

public class Main {
    public static void main(String[] args) {
        FileManager.readTxt("src/br/inatel/aula11/view/arquivo.txt");
        FileManager.writeText("src/br/inatel/aula11/view/arquivo.txt", "\nIsso é novo!");
        FileManager.readTxt("src/br/inatel/aula11/view/arquivo.txt");

        Funcionario f1 = new Funcionario("Edu","123456");
        Funcionario f2 = new Funcionario("Maria","234354");

        String dados_f1 = f1.converteInfo();
        String dados_f2 = f2.converteInfo();
        FileManager.writeText("docs/f1.txt", dados_f1);
        FileManager.writeText("docs/f2.txt", dados_f2);
        FileManager.readTxt("docs/f1.txt");
        FileManager.readTxt("docs/f2.txt");

    }
}
