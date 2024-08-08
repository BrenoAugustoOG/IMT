public class LivroDeNotas{
    private String nomeCurso;

    public LivroDeNotas(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }

    public void exibirMensagem(){
        System.out.println("Bem-vindo ao livro de notas " + "do curso " + getNomeDoCurso());
    }
    //getters
    //Retornar o valor atual de um atributo
    public String getNomeDoCurso(){
        return nomeCurso;
    }
    
    //setters
    //Receber um valor por parâmetro e vai atribuir o valor recebido para o atributo
    public void setNomeDoCurso(String nome){
        this.nomeCurso = nome;
    }

}