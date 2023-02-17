public class Moeda implements Comparable<Moeda>{
    private float valor;

    public Moeda(float valor){
        this.valor = valor;
    }

    public float getValor() {

        return valor;
    }

    @Override
    public int compareTo(Moeda o) {
        {
            if(valor < o.getValor())
                return -1;
            else if(valor > o.getValor())
                return 1;
            else
                return 0;
        }
    }
}
