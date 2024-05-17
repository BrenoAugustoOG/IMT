//Ler a idade de uma pessoa expressa em anos e exibir expressa em dias (considere que um ano tem 365 dias)
import javax.swing.JOptionPane;
public class exerc06{
    public static void main (String [] args) {
        
        //Entrada de Dados
        double idadeAno, idadeDias;

        //Decodificando as váriaveis
        idadeAno =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Sua idade:"));

        //Cálculo
        idadeDias = idadeAno * 365;

        //Saída de Dados
        JOptionPane.showMessageDialog(null, "Sua idade em dias:" + idadeDias);
    }
}

//Para funcionar, basta compilar o código "javac nomedoarquivo.java" e depois dar um java nomedoarquivo, basta fazer isso para criar o ByteCode de cada código! Ou somente dar RUN |> caso já tenha a extensão do Java :)