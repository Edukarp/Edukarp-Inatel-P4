public class HelloThread extends Thread {

    public String palavra;

    //Obrigatorio para a Thread
    public void run(){
        while (true){
            System.out.println(palavra);
            try {
                Thread.sleep(0); //Intervalos entre as ativaçoes (clock) em ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}
