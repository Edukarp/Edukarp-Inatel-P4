import javax.swing.*;
import java.io.FileNotFoundException;

public class Main {

    static void metodo1(){
        System.out.println("Inicio do metodo 1");
        metodo2();
        try {
            new java.io.FileInputStream("arquivo.txt");
        }catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado,   Tipo: " + e);
            //throw new RuntimeException(e);
        }
        System.out.println("Fim do metodo 1");
    }

    static void metodo2(){
        System.out.println("Inicio do metodo 2");
        int[] array = new int[10];
        try {
            for(int i = 0; i < 15; i++){
                array[i] = i;
                System.out.println(i);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Limite do Array Excedido,   Tipo: " + e);
        }
        System.out.println("Fim do metodo 2");
    }

    public static void main(String[] args) {
        System.out.println("Inicio do metodo Main");
        metodo1();
        System.out.println("Fim do metodo Main");

        //EXERCICIO

        float resultado;
        DivisaoSegura d1 = new DivisaoSegura();

        d1.addValores();

        resultado = d1.divide();

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

    }
}
