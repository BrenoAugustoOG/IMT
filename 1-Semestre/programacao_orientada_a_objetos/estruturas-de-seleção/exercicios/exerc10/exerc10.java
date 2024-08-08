package exerc10;

import javax.swing.*;

public class exerc10 {
    public static void main(String[] args) {
        int caixaDeSelecao, mistoQuente, saladaChinesa, sucoDeLaranja, sucoDeManga;

        caixaDeSelecao = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Digite o número selecionado: \n 1 - Misto Quente \n 2- Salada Chinesa \n 3- Suco de Laranja \n 4- Suco de Manga"));
        
        int opcaoEscolhida;
        opcaoEscolhida = caixaDeSelecao;
        if (opcaoEscolhida == 1) {
            JOptionPane.showMessageDialog(null,"Bom apetite, vai lhe custar R$5,50");
        }
        
        else if (opcaoEscolhida == 2) {
            JOptionPane.showMessageDialog(null, "Bom apetite, vai lhe custar R$10,20");
        }

        else if (opcaoEscolhida == 3) {
            JOptionPane.showMessageDialog(null, "Tenha um excelente drink, vai lhe custar R$4,00");
        }

        else if (opcaoEscolhida == 4) {
            JOptionPane.showMessageDialog(null,"Tenha um excelente drink, vai lhe custar R$3,50");
        }

    }
}
