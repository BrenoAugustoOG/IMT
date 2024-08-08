public class VetorDinamico<Tipo> {
    private Tipo[] elementos;
    private int quantidade;
    private int capacidade;

    public VetorDinamico() {
        this.capacidade = 4;
        this.elementos = (Tipo[]) new Object[capacidade];
    }

    public boolean estaCheio() {
        return quantidade == capacidade;
    }

    public boolean estaVazio() {
        return quantidade == 0;
    }

    public void adicionar(Tipo elemento) {
        if (estaCheio()) {
            aumentarCapacidade();
        }
        elementos[quantidade] = elemento;
        quantidade++;
    }

    public void remover() {
        if (!estaVazio()) {
            quantidade--;
            if (quantidade == capacidade / 4) {
                reduzirCapacidade();
            }
        }
    }

    public void aumentarCapacidade() {
        Tipo[] aux = (Tipo[]) new Object[capacidade * 2];
        for (int i = 0; i < quantidade; i++) {
            aux[i] = elementos[i];
        }
        elementos = aux;
        capacidade *= 2;
    }

    public void reduzirCapacidade() {
        Tipo[] aux = (Tipo[]) new Object[capacidade / 2];
        for (int i = 0; i < quantidade; i++) {
            aux[i] = elementos[i];
        }
        elementos = aux;
        capacidade /= 2;
    }

    public void exibir() {
        System.out.printf("Qtd: %d, Cap: %d\n",
                quantidade, capacidade);
        for (int i = 0; i < quantidade; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}