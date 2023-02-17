public class Main {
    public static void main(String[] args) {

        //Throw -> Lança uma excecao (customizada
        //Throws -> Segura o erro para ser tratado posteriormente
        Cadastro cadastro = new Cadastro();

        cadastro.addCodigo("123-4567");
        cadastro.addCodigo("mp-4567");
        cadastro.addCodigo("sp-4567");
        cadastro.addCodigo("bp-4567");

        cadastro.mostraCodigos();

    }
}
