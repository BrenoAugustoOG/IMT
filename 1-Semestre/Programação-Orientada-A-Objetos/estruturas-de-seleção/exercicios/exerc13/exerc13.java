package exerc13;

import javax.swing.JOptionPane;

public class exerc13 {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número inteiro: "));

        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número inteiro: "));

        int numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número inteiro: "));
        
        if (numero1 == numero2 && numero2 == numero3 && numero1 == numero3) {
            JOptionPane.showMessageDialog(null, "Erro, selecione números diferentes!");
        }

        else if (numero1 > numero2 && numero2 > numero3 && numero1 > numero3) {
            JOptionPane.showMessageDialog(null,"Essa é a ordem crescente: " + numero1 + numero2 + numero3);
        }

        else if (numero1 > numero3 && numero3 > numero2 && numero1 > numero2) {
            JOptionPane.showMessageDialog(null,"Essa é a ordem crescente: "+ numero1 + numero3 + numero2);
        }
        
        
        else if (numero2 > numero1 && numero1 > numero3 && numero2 > numero3) {
            JOptionPane.showMessageDialog(null,"Essa é a ordem crescente: " + numero2 + numero1 + numero3);
        }

        else if (numero2 > numero3 && numero3 > numero1 && numero2 > numero1) {
            JOptionPane.showMessageDialog(null,"Essa é a ordem crescente: "+ numero2 + numero3 + numero1);
        }

        else if (numero3 > numero1 && numero1 > numero2 && numero3 > numero2) {
            JOptionPane.showMessageDialog(null,"Essa é a ordem crescente: " + numero3 + numero1 + numero2);
        }

        else if (numero3 > numero2 && numero2 > numero1 && numero3 > numero1) {
            JOptionPane.showMessageDialog(null,"Essa é a ordem crescente: " + numero3 + numero2 + numero1);
        }
    }
}
