public class Main {
    public static void main(String[] args) {

        RedeSocial[] redesSociais = new RedeSocial[10];

        redesSociais[0] = new Instagram("1234",100);
        redesSociais[1] = new Twitter("1234",300);
        redesSociais[2] = new Facebook("1234",200);
        redesSociais[3] = new GooglePlus("1234",30);

        Usuario u1 = new Usuario(redesSociais);
        u1.setNome("Eduardo");
        u1.setEmail("eduardo.karpfenstein@ges.inatel.br");

        for(int i = 0; i< u1.getRedeSociais().length;i++) {
            if (u1.getRedeSociais()[i] instanceof Instagram) {
                Instagram i2 = (Instagram) u1.getRedeSociais()[i];
                i2.curtirPublicacao();
                i2.postarComentario();
                i2.postarFoto();
            } else if (u1.getRedeSociais()[i] instanceof Twitter) {
                Twitter t2 = (Twitter) u1.getRedeSociais()[i];
                u1.getRedeSociais()[i] = t2;
                t2.compartilhar();
                t2.postarVideo();
                t2.postarComentario();
            } else if (u1.getRedeSociais()[i] instanceof Facebook) {
                Facebook f2 = (Facebook) u1.getRedeSociais()[i];
                u1.getRedeSociais()[i] = f2;
                f2.compartilhar();
                f2.fazStreaming();
                f2.curtirPublicacao();
            } else if (u1.getRedeSociais()[i] instanceof GooglePlus) {
                GooglePlus g2 = (GooglePlus) u1.getRedeSociais()[i];
                u1.getRedeSociais()[i] = g2;
                g2.compartilhar();
                g2.fazStreaming();
                g2.postarVideo();
            }
        }

    }
}
