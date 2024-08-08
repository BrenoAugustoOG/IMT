import javax.swing.*;

public class exerc08{
    /**
     * @param args
     */
    public static void main(String[] args) {
        double altura, peso;

        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui a sua altura: "));

        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui a sua altura: "));

        double imc = (peso/altura)*(peso/altura);

        String imcFormat = String.format("%2f.", imc);
        
        int tipoImc;

        if (imc <= 18.5){
            tipoImc = 0;
        }
        
        else if (imc >= 18.5 && imc<=24.9) {
            tipoImc = 1;
        }
        
        else if (imc >= 25 && imc <= 29.9) {
            tipoImc = 2;
        }
        
        else if (imc >= 30 && imc <= 34.9) {
            tipoImc = 3;
        }
        
        else if (imc >= 35 && imc<=39.9) {
            tipoImc = 4;
        }
        
        else {
            tipoImc = 5;
        }
         
        String mensagem;
        switch (tipoImc) {
            case 0: 
                mensagem = "você está abaixo do peso ideal";
                break;
            
            case 1: 
                mensagem = "você está com o peso ideal, muito bem!";
                break;

            case 2:
                mensagem = "você está com sobrepeso, nada que um regime leve ja ajude!";
                break;
            
            case 3: 
                mensagem = "você está com obesidade leve.";
                break;
            
            case 4: 
                mensagem = "você está com obesidade moderada.";
                break;
            
            case 5: 
                mensagem = "você está com obesidade mórbida";
                break;
            
            default:
                mensagem = "Categoria de IMC não é reconhecida";
                break; 
        } 
        JOptionPane.showMessageDialog(null, "De acordo com o seu IMC, " + imcFormat + "e seu peso e stá na classe considerada" + mensagem);
    }
}

//NO SWITCH CASE SO FUNCIONARIA SOMENTE COM NUMEROS INTEIROS

