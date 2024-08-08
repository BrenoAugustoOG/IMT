import javax.swing.*;

public class ExemploFor {
    public static void main(String[] args) {
        double nota1, nota2;
        for(int contador = 1; contador <= 5; contador = contador + 1) {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 1: "));

            nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 2: "));

            JOptionPane.showMessageDialog(null, "Média: " + (nota1 + nota2) / 2);
            contador++; // contador = contador + 1;
        }
    }
}
//NO FOR EU DECLARO JUNTAMENTE DA CONDIÇÃO