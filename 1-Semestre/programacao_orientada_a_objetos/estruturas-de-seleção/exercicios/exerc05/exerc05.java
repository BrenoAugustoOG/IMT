import javax.swing.*;

public class exerc05{
    public static void main(String [] args) {
        int valor1 = Integer.parseInt(null, "Digite o primeiro número: ");

        int valor2 = Integer.parseInt(null, "Digite o segundo número: ");

        int valor3 = Integer.parseInt(null, "Digite o terceiro número: ");

        int somaValores = valor1 + valor2 + valor3;
        JOptionPane.showMessageDialog(null, "A soma dos valores é: " + somaValores);

        int mediaValores = (valor1 + valor2 + valor3)/3;
        JOptionPane.showMessageDialog(null, "A media dos valores é: " + mediaValores);

        int produtoValores = valor1*valor2*valor3;
        JOptionPane.showMessageDialog(null, "O produto dos valores é: " + produtosValores);

        if (valor1 >= valor2){
            JOptionPane.showMessageDialog(null, "Este é o maior número: " + valor1); 
        }
        if (valor2 >= valor3) {
            JOptionPane.showMessageDialog(null, "Este é o maior número: " + valor2); 
        }
        if (valor3 >= valor1) {
            JOptionPane.showMessageDialog(null, "Este é o maior número: " + valor3); 
        }
    }
}