//Ler a idade de uma pessoa expressa em ano, meses e dias e exibir a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias
import javax.swing.JOptionPane;
public class exerc07{
    public static void main(String [] args) {
        //Entrada de Dados
        double idadeAno, idadeMes, idadeDias, idadePessoa, somaAno, somaMes;

        //Decodificando as variáveis
        idadeAno =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Iremos calcular a sua idade em dias, porém precisamos saber quantos anos, meses e dia voce tem... Insira aqui os anos: "));

        idadeMes =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Insira aqui os meses: "));

        idadeDias =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Insira aqui os dias: "));

        //Cálculos
        idadePessoa = idadeAno * 365 + idadeMes * 30 + idadeDias;

        //Saída de Dados
        JOptionPane.showMessageDialog(null, "Sua idade total em dias é: " + idadePessoa);

    }
}

//Para funcionar, basta compilar o código "javac nomedoarquivo.java" e depois dar um java nomedoarquivo, basta fazer isso para criar o ByteCode de cada código! Ou somente dar RUN |> caso já tenha a extensão do Java :)