package exerc11;

import javax.swing.JOptionPane;

public class exerc11 {
    public static void main(String[] args) {
        int codigoDeEstado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite aqui o código de Estado: "));

        double valorInicialDaCarga = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui o valor inicial do produto: "));

        double valorFinalParte1;
        valorFinalParte1 = valorInicialDaCarga-(valorInicialDaCarga*0.012);
        
        double valorFinalParte2;
        valorFinalParte2 = valorInicialDaCarga-(valorInicialDaCarga*0.015);

        if (valorInicialDaCarga == 2 && valorInicialDaCarga == 5) {
            JOptionPane.showMessageDialog(null,"O valor final da carga sera de " + valorFinalParte1);
        }

        else if (valorInicialDaCarga == 1 && valorInicialDaCarga == 3 && valorInicialDaCarga == 4) {
            JOptionPane.showMessageDialog(null, "O valor final da carga será de " + valorFinalParte2);
        }
    }
}
