import static javax.swing.JOptionPane.*;
import static java.lang.Long.parseLong;
public class exerc03 {
    public static void main(String[] args) {
        //n! = n * (n-1) * (n-2) * ... * 2* 1
        //0! = 1
        long n = parseLong(showInputDialog(null, "Digite o valor"));
        long fatorial = 1; //p*1 = p p +0 = p m X I = M
        for (long cont = 1; cont <= n; cont++) {
            fatorial = fatorial*cont;
        }
        showMessageDialog(
            null,
            String.format("%d! = %d", n, fatorial)
        );
        /*FORMA MANUAL:
        fatorial = fatorial *2; //2
        fatorial = fatorial *2; //2
        fatorial = fatorial *2; //2 */
        }
    }