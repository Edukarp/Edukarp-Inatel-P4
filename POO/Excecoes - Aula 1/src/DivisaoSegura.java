import javax.swing.*;

public class DivisaoSegura {
    public float num1;
    public float num2;

    public DivisaoSegura(){
    }

    public void addValores(){
        try {
            num1 = Float.parseFloat(JOptionPane.showInputDialog("Primeiro numero?"));//JOptionPane e String entao usa o parseFloat pra fazer o Cast
            num2 = Float.parseFloat(JOptionPane.showInputDialog("Segundo numero?"));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Numero Invalido!");
        }
    }

    public float divide(){
        float divisao = 0;
        try{
            divisao = num1/num2;
        }catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null,"Divisao Invalida!");
        }
        return divisao;
    }
}
