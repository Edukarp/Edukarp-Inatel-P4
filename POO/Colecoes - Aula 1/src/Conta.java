
public class Conta implements Comparable<Conta> { //Implementando interface para comparar metodos

    String nome;
    int numero;
    float saldo;

    public Conta(String nome, int numero, float saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    //Dando override obrigatorio da interface de comparacao
    @Override
    public int compareTo(Conta o) {
        if(numero < o.numero)
            return -1;
        else if(numero > o.numero)
            return 1;
        else
            return 0;
    }
}