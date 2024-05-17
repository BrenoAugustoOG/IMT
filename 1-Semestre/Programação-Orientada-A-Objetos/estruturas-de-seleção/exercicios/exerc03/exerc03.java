import javax.swing.*;

public class exerc03{

    public static void main(String[] args){
        double valor1, valor2;

        valor1 = 
        Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número inteiro:")); 

        valor2 = 
        Double.parseDouble(JOptionPane.showInputDialog(null, "DIgite o segundo número inteiro:"));

        if (valor1 > valor2) {
            JOptionPane.showMessageDialog(null, "O primeiro numero que voce digitou é maior que o segundo número!");
        }

        else if (valor2 > valor1) {
            JOptionPane.showMessageDialog(null, "O segundo numero que voce digitou é maior que o primeiro número!");
        }
    }
}