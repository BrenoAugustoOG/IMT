import javax.swing.*;
public class exerc10{
    public static void main(String [] args) {
        double carroNovo, custoFabrica, impostos, percentualDistribuidor;

        custoFabrica = 
        Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui o custo de fábrica do carro: "));

        percentualDistribuidor = (custoFabrica/100)*28;
        impostos = (custoFabrica/100)*45;

        carroNovo = custoFabrica + impostos + percentualDistribuidor;

        JOptionPane.showMessageDialog(null, "O preço de um carro novo é: " + carroNovo);
    }
}