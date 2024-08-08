import javax.swing.*;
public class exerc15{
    public static void main(String [] args) {
        int valorA = Integer.parseInt(JOptionPane.showInputDialog(null, "O valor do seu primeiro número é de: "));

        int valorB = Integer.parseInt(JOptionPane.showInputDialog(null, "O valor do segundo número é de: "));

        int soma = valorA + valorB;

        JOptionPane.showMessageDialog(null, "SOMA: " + soma);
    }
}