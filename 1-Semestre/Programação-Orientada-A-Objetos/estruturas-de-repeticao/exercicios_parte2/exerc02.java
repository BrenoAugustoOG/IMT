import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class exerc02 {
    public static void main(String[] args) {
        int valorN = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de N desejado: "));
        
        double valorE = 1;
        int fatorial = 1;

        for(int i = 1; i <= valorN; i++ ) { // i + i+1;
            fatorial *= i; //calcular o fatorial, fatorial = fatorial * i
            valorE += 1.0/fatorial; // valorE = valorE + 1.0/fatorial
        }
        DecimalFormat d = new DecimalFormat("##.###");
        JOptionPane.showMessageDialog(null,"O valor de E é: " + d.format(valorE));
    }
}
