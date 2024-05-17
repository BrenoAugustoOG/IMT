public class Aluno extends Pessoa{
    int ra;    
    
    public Aluno(String nome, int idade){
        super(nome, idade);
        System.out.println("Aluno Construído! Nome: " + nome + " | " + " Idade: " + idade);
    }

    /*public Aluno () {
        super("Maria", 19);
        System.out.println("Aluno construído!");
    } */
}
