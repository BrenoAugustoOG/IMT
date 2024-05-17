import javax.swing.*;
public class exerc11{
    public static void main(String [] args) {
        double carrosVendidos, totalVendas, salarioFixo, comissaoPorCarro, comissaoVendas, salarioTotal;

        carrosVendidos =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a quantidade de carros que você vendeu esse mês? "));

        totalVendas = 
        Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor total de suas vendas desse mês? "));

        salarioFixo =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto é o seu salário fixo? "));

        comissaoPorCarro =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto é a sua comissão por carro vendido? "));

        comissaoVendas = (totalVendas/100)*5;
        salarioTotal = comissaoVendas + comissaoPorCarro + salarioFixo;

        JOptionPane.showMessageDialog(null, "O seu salário será de R$" + salarioTotal);
    }
}