import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class exerc01{
    public static void main(String[] args) {
        double salario = 1000;
        double percentual = 0.015;
        
        for(int ano = 2006; ano <= 2024; ano = ano +1){
            salario += salario*percentual; //salario = salario + salario*percentual
            percentual += 0.015; //percentual *= 2; | percentual + percentual * 2
            System.out.println("Salario: " + salario + "Percentual: " + percentual);
        }

        DecimalFormat d = new DecimalFormat("#.###");
        JOptionPane.showMessageDialog(null, "Salário: " + d.format(salario));
    }
}