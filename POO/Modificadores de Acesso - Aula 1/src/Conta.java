public class Conta {

    private int numero;
    private Cliente titular;
    private float saldo;
    private float limite;

    //Getters e Setters (Obviamante depende do contexto nao precisa pra todos)
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public Cliente getTitular() {
        return titular;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    public float getLimite() {
        return limite;
    }

    //Metodos
    public void sacar(float quantia){
        if(quantia <= saldo) { //Controlando a operacao de Saque
            saldo = saldo - quantia;
            System.out.println("Saque Realizado");
            System.out.println("Novo Saldo: " + saldo);
        }
        else
            System.out.println("Saque NEGADO!   Saldo Insuficiente");

        System.out.println("-------------------------------------");
    }
}
