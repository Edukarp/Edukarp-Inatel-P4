public class Twitter extends RedeSocial implements Compartilhamento{

    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    public Twitter(){

    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Publicacao curtida no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentario postado no Twitter");
    }

    @Override
    public void postarFoto() {
        System.out.println("Foto postado no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Video postado no Twitter");
    }

    @Override
    public void compartilhar() {
        System.out.println("Publicacao compartilhada no Twitter");
    }

}
