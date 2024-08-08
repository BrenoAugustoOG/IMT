//Ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores
import javax.swing.JOptionPane;
public class exerc08{
    public static void main (String [] args) {
        //Entrada de Dados
        double totalEleitores, votosBrancos, votosNulos, votosValidos;

        //Decodificando as variaveis
        totalEleitores =
        Integer.parseInt(JOptionPane.showInputDialog(null,"O número total de eleitores: "));

        votosBrancos =
        Integer.parseInt(JOptionPane.showInputDialog(null, "O número de votos brancos: "));

        votosNulos =
        Integer.parseInt(JOptionPane.showInputDialog(null, "O número de votos nulos: "));

        votosValidos =
        Integer.parseInt(JOptionPane.showInputDialog(null, "O número de votos válidos: "));

        //Cálculos
        double percentualBrancos, percentualNulos, percentualValidos;
        percentualBrancos = votosBrancos / totalEleitores * 100;
        percentualNulos = votosNulos / totalEleitores * 100;     
        percentualValidos = votosValidos / totalEleitores * 100;

        //Saída de Dados
        JOptionPane.showMessageDialog(null, "O seu percentual de Votos Brancos é: " + percentualBrancos + "%\n" + "O seu percentual de Votos Nulos é: " + percentualNulos + "%\n" + "O seu percentual de Votos Válidos é: " + percentualValidos + "%"); 
    }
}

//Para funcionar, basta compilar o código "javac nomedoarquivo.java" e depois dar um java nomedoarquivo, basta fazer isso para criar o ByteCode de cada código! Ou somente dar RUN |> caso já tenha a extensão do Java :)