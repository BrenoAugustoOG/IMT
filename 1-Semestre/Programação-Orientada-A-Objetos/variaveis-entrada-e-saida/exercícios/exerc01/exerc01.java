//1. Ler a cotação do dólar e a quantidade de dólares. Converter para real e mostrar o resultado
import javax.swing.JOptionPane;
public class exerc01{
    public static void main (String [] args) {
        //Entrada de Dados
        double cotacaoDolar, quantidadeDolar, conversaoReal;

        //Decodificando as variáveis
        cotacaoDolar =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Cotação do dólar"));

        quantidadeDolar =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade em dólar"));

        //Conversão do dólar para Real
        conversaoReal = cotacaoDolar * quantidadeDolar;

        //Saída de Dados (Resultado)
        JOptionPane.showMessageDialog(null, "O seu valor em reais é R$" + conversaoReal);
    }
}

//Para funcionar, basta compilar o código "javac nomedoarquivo.java" e depois dar um java nomedoarquivo, basta fazer isso para criar o ByteCode de cada código! Ou somente dar RUN |> caso já tenha a extensão do Java :)