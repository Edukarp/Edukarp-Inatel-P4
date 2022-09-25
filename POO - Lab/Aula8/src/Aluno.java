public class Aluno extends Usuario{

    public Aluno(int matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
    }

    private int matricula;
    private String curso;

    public void criaLogin(String login, String senha){
        setLogin(login);
        setSenha(senha);

    }

    public void mostraInfos(){
        System.out.println("--------------------------------------------");
        System.out.println("Usuario: " + getLogin() + "    matricula: " + matricula + "    curso: " + curso);
        System.out.println("--------------------------------------------");

    }

}
