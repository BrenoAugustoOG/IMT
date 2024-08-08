//Ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo
import javax.swing.JOptionPane;
public class exerc05{
    public static void main (String [] args) {

        //Entrada de Dados
        double valorBase, valorAltura, areaRetangulo;

        //Decodificando a váriavel
        valorBase =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da base do Retângulo"));

        valorAltura =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da altura do Retângulo"));

        //Cálculo
        areaRetangulo = valorBase * valorAltura;

        //Saída de Dados
        JOptionPane.showMessageDialog(null, "A área do retangulo é:" + areaRetangulo);
    }
}

//Para funcionar, basta compilar o código "javac nomedoarquivo.java" e depois dar um java nomedoarquivo, basta fazer isso para criar o ByteCode de cada código! Ou somente dar RUN |> caso já tenha a extensão do Java :)