//Ler um valor inteiro e exibir seu antecessor
import javax.swing.JOptionPane;
public class exerc04{
    public static void main (String [] args) {
        
        //Entrada de Dados
        double resultado, valorInteiro;

        //Decodificando a variável
        valorInteiro =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Coloca o valor que deseja inseir:"));

        //Cálculos
        resultado = valorInteiro - 1;

        //Saída de Dados
        JOptionPane.showMessageDialog(null, "Seu antecessor é:" + resultado);
    }
}

//Para funcionar, basta compilar o código "javac nomedoarquivo.java" e depois dar um java nomedoarquivo, basta fazer isso para criar o ByteCode de cada código! Ou somente dar RUN |> caso já tenha a extensão do Java :)