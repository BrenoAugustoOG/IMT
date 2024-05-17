import javax.swing.*;
import java.util.*;

public class exerc16{
    public static void main(String [] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));

        int notas200 = valor / 200;
        valor %= 200; //Código equivalente à valor = valor % 200
        
        int notas100 = valor / 100;
        valor %= 100;

        int notas50 = valor / 50;
        valor %= 50;

        int notas20 = valor / 20;
        valor %= 20;

        int notas10 = valor / 10;
        valor %= 10;

        int notas5 = valor / 5;
        valor %= 5;

        int notas2 = valor / 2;
        valor %= 2;

        int notas1 = valor;

        int totalNotas = notas200 + notas100 + notas50 + notas20 + notas10 + notas5 + notas2 + notas1;

        JOptionPane.showMessageDialog(null, "A quantidade de notas é: " + totalNotas);
    }
}