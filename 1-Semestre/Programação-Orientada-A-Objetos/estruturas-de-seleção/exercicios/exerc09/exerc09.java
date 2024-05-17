package exerc09;

import javax.swing.*;

public class exerc09 {
    public static void main(String[] args) {
        
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da sua primeira nota: "));

        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da segunda nota: "));

        double media;
        media = (nota1+nota2)/2;
        
        int valorNota;
        if (media < 2) {
            valorNota = 0;
        }

        else if (media >= 2 && media <= 6) {
            valorNota = 1;
        }

        else if (media >=6 && media <= 7) {
            valorNota = 2;
        }

        else if (media >=7 && media <= 9) {
            valorNota = 3;
        }

        else if (media > 9) {
            valorNota = 4;
        }

        else {
            valorNota = 5;
        }

        switch (valorNota) {
            case 0:
                JOptionPane.showMessageDialog(null, "Reprovado. Nos vemos semestre que vem.");
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "Não está aprovado, mas ainda pode fazer a segunda época");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Aprovado no limite, estude mais um pouco");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Aprovado.");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Parabens, continue assim!");
                break;

            default:
                JOptionPane.showMessageDialog(null,"Não existe média acima!");
                break;
        }
    }
}
