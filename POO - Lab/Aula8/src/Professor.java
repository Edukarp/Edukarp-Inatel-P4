public class Professor extends Usuario implements Funcionario{

    public Professor(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    @Override
    public void fazerLogin(String login, String senha) {
        if(autenticar(senha) && login == this.getLogin())
            System.out.println("Autenticado");
        else
            System.out.println("Usuario ou senha incorretos");
    }

    @Override
    public boolean autenticar(String senha) {
        if(this.getSenha() == senha)
            return true;
        else
            return false;
    }
}
