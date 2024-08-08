import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Double.parseDouble;
import static java.lang.Byte.parseByte;
import static java.lang.Short.parseShort;
import static java.lang.Long.parseLong;
import static java.lang.String.format;

public class exerc07{
    public static void main(String[] args) {
        double valorPeca;  
        //byte(1 byte), short(2 bytes), int(4 bytes), long(8 bytes)
        byte opcaoUsuario;
        valorPeca = parseDouble(showInputDialog(null, "Digite o valor da Peça"));
        opcaoUsuario = parseByte(showInputDialog(null, "0 - A vista \n 1 - Cartão Parcelado \n 2- Crediário"));
        switch(opcaoUsuario) {
            case 0:{
                showMessageDialog(null, "O valor da Roupa R$" + (valorPeca - (valorPeca*0.1)));
                break;
            }
            
            case 1: {
                short numeroParcelas = parseShort(showInputDialog(null, "Número de parcelas: "));
                String exibir = String.format(
                    "Valor de cada parcela R$ %f" , valorPeca / numeroParcelas
                );
                showMessageDialog(null, exibir);
                break;
            }
            
            case 2: {
                long numeroParcelas = parseLong(showInputDialog("Número de parcelas do Crediário: "));
                valorPeca = valorPeca*1.1;
                showMessageDialog(
                    null,
                    format("Valor total: R$%f. Valor da parcela: R$%f" , valorPeca, valorPeca / numeroParcelas)
                );
                break;
            }

            default: {
                showMessageDialog(null, "Opção Inválida");
                break;
            }
        }
    }
}