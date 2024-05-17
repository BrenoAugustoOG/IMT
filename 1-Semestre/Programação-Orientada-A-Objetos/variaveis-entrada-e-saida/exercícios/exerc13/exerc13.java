import javax.swing.*;

public class exerc13{
    public static void main(String [] args) {
        double valorRaio, area;

        valorRaio =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Insira aqui o valor do raio que deseja calcular a área: "));

        area = Math.PI*(valorRaio*valorRaio);

        JOptionPane.showMessageDialog(null, "O valor da sua área será de: " + area);
    }
}