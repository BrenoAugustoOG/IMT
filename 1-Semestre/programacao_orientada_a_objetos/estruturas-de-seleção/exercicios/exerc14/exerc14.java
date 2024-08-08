package exerc14;

import javax.swing.JOptionPane;

public class exerc14 {
    public static void main(String[] args) {
        double notaAluno1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui a nota do primeiro aluno: "));
        double notaAluno2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui a nota do segundo aluno: "));
        double notaAluno3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui a nota do terceiro aluno: "));
        double notaAluno4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui a nota do quarto aluno: "));
        double notaAluno5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui a nota do quinto aluno: "));
        double notaAluno6 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui a nota do sexto aluno: "));
        double notaAluno7 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui a nota do sétimo aluno: "));
        double notaAluno8 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui a nota do oitavo aluno: "));
        double notaAluno9 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui a nota do nono aluno: "));
        double notaAluno10 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui a nota do décimo aluno: "));

        double media;
        media = (notaAluno1+notaAluno2+notaAluno3+notaAluno4+notaAluno5+notaAluno6+notaAluno7+notaAluno8+notaAluno9+notaAluno10)/10;

        
    }
}
