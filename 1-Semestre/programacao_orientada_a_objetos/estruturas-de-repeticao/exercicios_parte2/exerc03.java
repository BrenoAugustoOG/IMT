import javax.swing.JOptionPane;

public class exerc03 {
    public static void main(String[] args) {
        int valorN = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de N desejado: "));
        
        for(int i = 1; i <= valorN; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
            int fatorial = 1;
            for(int j =1; j <= numero; j++) {
                fatorial *= j;
            }
            JOptionPane.showMessageDialog(null,"Fatorial: " + fatorial);
        }
    }
}
