import javax.swing.*;

public class exerc02{
    public static void main(String [] args) {
        double valor1, valor2;

        valor1 =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número:"));

        valor2 =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número:"));

        if (valor2 == valor1) {
            JOptionPane.showMessageDialog(null, "Os valores que você digitou são iguais!");
        }
    }
}