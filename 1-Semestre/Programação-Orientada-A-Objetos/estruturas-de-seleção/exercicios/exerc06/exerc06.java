import javax.swing.*;
public class exerc06{
    public static void main(String [] args) {
        double valor1, valor2;

        valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo da sua conta bancária: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade de que você quer retirar: "));
    }
}