import javax.management.InstanceAlreadyExistsException;

public class Usuario {
    private String nome;
    private String email;
    private static int numRedes = 0;

    private RedeSocial[] redeSociais = new RedeSocial[10];


    public Usuario(RedeSocial[] redeSociais){
        for(int i = 0; i< redeSociais.length;i++){
            if(redeSociais[i] != null){
                this.redeSociais[numRedes] = redeSociais[i];
                numRedes++;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RedeSocial[] getRedeSociais() {
        return this.redeSociais;
    }
}
