public class Conta {

    public float saldo;

    public void saca(float valor){
        if(saldo < valor)
            throw new SaldoInsuficienteException("Saldo Insuficiente " + " Tente novamente!");
        else
            saldo = saldo - valor;
    }

}
