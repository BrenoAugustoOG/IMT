import javax.swing.*;
public class exerc14{
    public static void main(String [] args) {
        double notaA, notaB, notaC, mediaFinal;
        
        notaA = 
        Double.parseDouble(JOptionPane.showInputDialog(null, "Escreva aqui a sua primeira nota: "));
        
        notaB =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Escreva aqui a sua segunda nota: "));

        notaC =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Escreva aqui a sua terceira nota: "));

        mediaFinal = (notaA*2+notaB*3+notaC*5)/10;

        JOptionPane.showMessageDialog(null, "A sua média final vai ser de: " + mediaFinal); 
    }
}