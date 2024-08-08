import javax.swing.*;
public class IfElseEncadeado{
    public static void main(String [] args) {
        double nota;

        nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua nota:"));

        if (nota >= 90) {
            JOptionPane.showMessageDialog(null, "Você foi aprovado com uma nota excelente, meus parabens!");
        }

        else if (nota >= 80){
            //Entra no bloco somente se a nota estiver entre 80 e 89.
            JOptionPane.showMessageDialog(null, "Voce foi aprovado com uma nota ótima, parabens!");
        }

        else if(nota >= 70){
            //Entra no bloco somente se a nota estiver entre 70 e 79.
            JOptionPane.showMessageDialog(null, "Parabens!");
        }

        else {
            JOptionPane.showMessageDialog(null, "Infelizmente você foi reprovado, até ano que vem...");
        }
    }
}