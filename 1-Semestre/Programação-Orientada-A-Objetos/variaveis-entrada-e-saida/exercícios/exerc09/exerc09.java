//Ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e exibir o valor do novo salário.
import javax.swing.JOptionPane;
public class exerc09{
    public static void main (String [] args) {
        //Entrada de Dados
        double salario, percentualReajuste, novoSalario;
        
        //Decodificando as variáveis
        salario =
        Double.parseDouble(JOptionPane.showInputDialog(null, "O seu salário é: "));

        percentualReajuste =
        Double.parseDouble(JOptionPane.showInputDialog(null, "O seu reajuste é de: "));

        //Cálculos
        novoSalario = salario * (1 + percentualReajuste / 100);

        //Saída de Dados
        JOptionPane.showMessageDialog(null, "O seu novo salário será: " + novoSalario);
    }
}

//Para funcionar, basta compilar o código "javac nomedoarquivo.java" e depois dar um java nomedoarquivo, basta fazer isso para criar o ByteCode de cada código! Ou somente dar RUN |> caso já tenha a extensão do Java :)