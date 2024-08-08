import javax.swing.*;

public class exerc04{
    public static void main(String [] args) {
        double valor1, valor2;

        valor1 =
        Double.parseDouble(JOptionPane.showInputDialog(null, "DIgite o primeiro valor:"));

        valor2 =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo valor:"));

        if (valor1 > valor2) {
            JOptionPane.showMessageDialog(null, "Este é o maior número: " + valor1);
        }

        if (valor2 > valor1) {
            JOptionPane.showMessageDialog(null, "Este é o maior número: " + valor2);
        }

        else if (valor1 == valor2) {
            JOptionPane.showMessageDialog(null, "Estes números são iguais!");
        }
    }
}