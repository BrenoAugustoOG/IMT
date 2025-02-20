public class NossoVetor {
    private int[] vetor;
    private int ocupacao;

    public NossoVetor(int tamanho) {
        vetor = new int[tamanho];
        ocupacao = 0;
    }

    public NossoVetor() {
        new NossoVetor(10);
    }

    public void inserir(int i) {
        vetor[ocupacao++] = i;
    }

    public boolean estaCheio() {
        return (ocupacao == vetor.length);
        // if (ocupacao == vetor.lenght) {return true};
    }
}
