public class ProfessorPesquisador extends Professor{
    public void pesquisar(){
        System.out.println("Pesquisando...");
    }

    public ProfessorPesquisador(String nome, int idade) {
        super(nome, idade);
    }
}
