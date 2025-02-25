public class NossoVetor {
    private int[] vetor;
    private int ocupacao;

    public NossoVetor(int tamanho) {
        vetor = new int[tamanho];
        ocupacao = 0;
    }

    public NossoVetor() {
        this(10);
    }

    void aumentaVetor(){
        int[] temp = new int[vetor.length * 2];
        for (int i = 0; i < vetor.length; i++) {
            temp[i] = vetor[i];
        }
        vetor = temp;
    }

    public void insere(int i) {
        if (estaCheio())
            aumentaVetor();
        vetor[ocupacao++] = i;
    }

    public boolean estaCheio() {
        return ocupacao == vetor.length;
    }

    public boolean estaVazio() {
        return ocupacao == 0;
    }

    public int remove() {
        if (!estaVazio())
            return vetor[--ocupacao];
        return -1;
    }

    @Override
    public String toString() {
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++) {
            s += vetor[i] + " ";
        }
        return s + "\n";
    }
}