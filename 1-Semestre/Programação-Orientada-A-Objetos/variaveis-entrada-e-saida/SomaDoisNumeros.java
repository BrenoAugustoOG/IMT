import javax.swing.JOptionPane;

public class SomaDoisNumeros{
    public static void main (String [] args) {
        
        // Declaração de Variáveis
        double primeiroNumero, segundoNumero, resultado;

        // Entrada de Dados:
        primeiroNumero = 
        Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));

        segundoNumero = 
        Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
        // - Usuário digita dois números e colocamos esses dois


        // Processamento
        resultado = primeiroNumero + segundoNumero;

        // Saída de Dados (Resultado)
        JOptionPane.showMessageDialog(null,"O resultado é" + resultado);
    }
}