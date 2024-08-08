public class AlunoDeGraduacao extends Aluno{
    //herda todos os atributos e métodos da classe Pessoa, então herda todos os atributos da classe Pessoa
    //Agora tambem está herdendando os atributos do Aluno e como o Aluno tambem herda os atributos da classe Pessoa
    double nota1, nota2, notaFinal;
    
    public AlunoDeGraduacao(String nome, int idade) {
        super(nome, idade);
    }
}
