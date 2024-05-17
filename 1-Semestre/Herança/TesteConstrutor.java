public class TesteConstrutor {
    public static void main(String[] args) {
        //Chamo somente o construtor da classe Pessoa (mãe)
        Pessoa pessoa = new Pessoa("João", 22);
        
        //Quando chamo o construtor da classe Aluno, obrigatoriamente o construtor da classe Pessoa (mãe) também é chamado
    
        Aluno aluno = new Aluno("Breno", 18);
    }
}
