public class GooglePlus extends RedeSocial implements Compartilhamento, VideoConferencia{

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    public GooglePlus(){

    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Publicacao curtida no Google Plus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentario postado no Google Plus");
    }

    @Override
    public void postarFoto() {
        System.out.println("Foto postado no Google Plus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Video postado no Google Plus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Publicacao compartilhada no Google Plus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo Streaming no Google Plus");
    }
}
