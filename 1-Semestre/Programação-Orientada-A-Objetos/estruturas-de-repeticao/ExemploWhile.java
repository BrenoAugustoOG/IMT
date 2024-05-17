import javax.swing.*;

public class ExemploWhile{
    public static void main(String[] args) {
        double nota1, nota2;
        int contador = 1;
        while (contador <= 5) { 
// no caso, o <= seria o numero de vezes que ele iria se repetir
            nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 1: "));

            nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 2: "));
            
            double media = (nota1+nota2)/2;
            JOptionPane.showMessageDialog(null,"Média: " + media); contador++; // contador = contador + 1;
            
        }
    }
}
//NO WHILE EU DECLARO ANTES E DEPOIS EU COLOCO A CONDIÇÃO