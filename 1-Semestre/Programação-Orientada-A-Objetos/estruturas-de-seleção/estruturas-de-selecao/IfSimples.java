import javax.swing.*;
import java.util.*;
public class IfSimples{
    public static void main(String [] args) {
        double nota;
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota final:"));
        if (nota >= 90) {
            JOptionPane.showMessageDialog(null, "Aprovado, meus parabens!");
        }

        else {
            JOptionPane.showMessageDialog(null, "Você foi reprovado infelizmente!")
        }
    }
}