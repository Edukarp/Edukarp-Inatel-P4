public class Carro {

    String modelo;
    double velocidade;

    public Carro(){
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    void buzina(){
        System.out.println("Bi Bi");
    }

    void acelerar(double Novavelocidade){
        velocidade = Novavelocidade;
        System.out.println("Acelerou para: " + velocidade + "km/h");
    }

    void frear(double Novavelocidade){
        velocidade = Novavelocidade;
        System.out.println("Desacelerou para: " + velocidade + "km/h");
    }

}
