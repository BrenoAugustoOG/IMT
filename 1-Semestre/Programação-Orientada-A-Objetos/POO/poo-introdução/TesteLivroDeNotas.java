import javax.swing.JOptionPane;
public class TesteLivroDeNotas {
    public static void main(String[] args) {
        
        String nomeCurso1 = JOptionPane.showInputDialog("Digite o nome " + "do curso 1");
        String nomeCurso2 = JOptionPane.showInputDialog("Digite o nome " + "do curso 2 ");
        
        LivroDeNotas livro1 = new LivroDeNotas(nomeCurso1);
        LivroDeNotas livro2 = new LivroDeNotas(nomeCurso2);
        //livro1.setNomeDoCurso(nomeCurso);
        
        livro1.exibirMensagem();
        livro2.exibirMensagem();
    }
}
