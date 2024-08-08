import javax.swing.*;

public class ExplicacaoDoWhile {
    public static void main(String[] args) {
        double nota1, nota2;
        int contador = 1;

        do {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota: "));

            nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));

            double media = (nota1 + nota2) / 2;
            JOptionPane.showMessageDialog(null, "Média: " + media);
        } while (contador <= 5);
    }
}

// Declara a varíavel no "do" e depois de tudo, a condição vai no "While"