public class Main{
    public static void main(String[] args) {
        //implements Runnable ou extends Thread na classe

        HelloThread t1 = new HelloThread();
        t1.palavra = "Ola";

        HelloThread t2 = new HelloThread();
        t2.palavra = "Hello";

        HelloThread t3 = new HelloThread();
        t3.palavra = "Hallo";

        HelloThread t4 = new HelloThread();
        t4.palavra = "Ciao";

        //Ignorando a ordem sequencial padrao por ser uma Thread e rodando ao msm tempo
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
