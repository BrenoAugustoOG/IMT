public class ArvoreBinaria<T extends Comparable<T>> {
    private No<T> raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public boolean arvoreVazia() {
        return raiz == null;
    }

    public void insere(T info) {
        No<T> novo = new No<>(info);
        if (arvoreVazia()) {
            raiz = novo;
        } else {
            insereRec(novo, raiz);
        }
    }

    void insereRec(No<T> novo, No<T> atual) {
        if (novo.getInfo().compareTo(atual.getInfo()) > 0) {
            if (atual.getDireita() == null) {
                atual.setDireita(novo);
            } else {
                insereRec(novo, atual.getDireita());
            }
        } else {
            if (atual.getEsquerda() == null) {
                atual.setEsquerda(novo);
            } else {
                insereRec(novo, atual.getEsquerda());
            }
        }
    }

    // Percorre a árvore em ordem simétrica para o toString (esquerda, raiz,
    // direita)
    @Override
    public String toString() {
        if (arvoreVazia())
            return "Árvore vazia!";
        return toStringRec(raiz);
    }

    String toStringRec(No<T> atual) {
        String s = "";
        if (atual.getEsquerda() != null)
            s += toStringRec(atual.getEsquerda());
        s += atual + "\n";
        if (atual.getDireita() != null)
            s += toStringRec(atual.getDireita());
        return s;
    }
}