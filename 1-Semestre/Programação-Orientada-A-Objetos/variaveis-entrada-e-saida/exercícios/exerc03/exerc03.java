//Calcular o pagamento de comissão de vendedores de peças, levando-se em consideração que sua comissão será de 5% do total da venda e que você tem os seguintes dados: preço unitário da peça e quantidade vendida.
import javax.swing.JOptionPane;
public class exerc03{
    public static void main(String [] args) {
        
        //Entrada de Dados
        double comissaoVendedores, totalVenda, precoPeca, quantidadeVendida;

        //Decodifica as variáveis
        precoPeca =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Preço unitário da peça"));

        quantidadeVendida =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade vendida"));

        //Cálculo
        totalVenda = precoPeca * quantidadeVendida;
        comissaoVendedores = totalVenda / 20;

        //Saída de Dados
        JOptionPane.showMessageDialog(null, "A comissão de venda:" + comissaoVendedores);
    }
}

//Para funcionar, basta compilar o código "javac nomedoarquivo.java" e depois dar um java nomedoarquivo, basta fazer isso para criar o ByteCode de cada código! Ou somente dar RUN |> caso já tenha a extensão do Java :)