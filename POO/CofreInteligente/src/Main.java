import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Moeda m1 = new Moeda(0.05f);
        Moeda m2 = new Moeda(0.10f);
        Moeda m3 = new Moeda(0.25f);
        Moeda m4 = new Moeda(0.5f);
        Moeda m5 = new Moeda(1f);

        Cofrinho c1 = new Cofrinho();
        c1.addMoeda(m2);
        c1.addMoeda(m1);
        c1.addMoeda(m4);
        c1.addMoeda(m3);
        c1.addMoeda(m5);

        System.out.println("Quant total de moedas: " + c1.getQuantMoedas());
        System.out.println("Moeda de maior Valor: " + c1.getMoedaMaiorValor().getValor());
        System.out.printf("Valor total: %.2f %n", (c1.getValorTotal()), "\n");
        c1.ordenaMoedas();

    }
}
