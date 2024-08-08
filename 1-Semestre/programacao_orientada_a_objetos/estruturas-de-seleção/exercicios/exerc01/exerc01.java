import javax.swing.*;

public class exerc01{
    public static void main (String [] args) {
        double valor1, valor2;

        valor1 =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do número inteiro:"));

        valor2 =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do número real:"));

        if (valor1 < valor2) {
            JOptionPane.showMessageDialog(null, "O número real é maior que o número inteiro que você digitou:");
        }
    }
}