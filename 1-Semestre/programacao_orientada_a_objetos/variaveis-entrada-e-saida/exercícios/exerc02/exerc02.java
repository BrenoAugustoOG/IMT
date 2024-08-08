//Ler 4 números, calcular o quadrado para cada um, somar todos os quadrados e mostrar o resultado
import javax.swing.JOptionPane;
public class exerc02{
    public static void main (String [] args) {
        //Entrada de Dados
        double primeiroNumero, segundoNumero, terceiroNumero, quartoNumero, quadradoDoPrimeiro, quadradoDoSegundo, quadadradoDoTerceiro, quadradoDoQuarto, somaDosQuadrados;

        //Decodificar as Variáveis
        primeiroNumero =
        Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o primeiro número"));

        segundoNumero =
        Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o segundo número"));

        terceiroNumero =
        Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o terceiro número"));

        quartoNumero =
        Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o quarto número"));

        //Cálculos
        quadradoDoPrimeiro = primeiroNumero*primeiroNumero;

        quadradoDoSegundo = segundoNumero*segundoNumero;

        quadadradoDoTerceiro = terceiroNumero*terceiroNumero;

        quadradoDoQuarto = quartoNumero*quartoNumero;

        somaDosQuadrados = quadradoDoPrimeiro + quadradoDoSegundo + quadadradoDoTerceiro + quadradoDoQuarto;

        //Saída de Dados
        JOptionPane.showMessageDialog(null, "O resultado é" + somaDosQuadrados);
    }
}

//Para funcionar, basta compilar o código "javac nomedoarquivo.java" e depois dar um java nomedoarquivo, basta fazer isso para criar o ByteCode de cada código! Ou somente dar RUN |> caso já tenha a extensão do Java :)