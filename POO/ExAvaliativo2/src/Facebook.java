public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }
    public Facebook(){

    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Publicacao curtida no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentario postado no Facebook");
    }

    @Override
    public void postarFoto() {
        System.out.println("Foto postado no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Video postado no Facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("Publicacao compartilhada no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo Streaming no Facebook");
    }
}
