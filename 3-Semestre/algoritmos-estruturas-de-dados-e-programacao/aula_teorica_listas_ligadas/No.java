public class No {
    private int info;
    private No proximo;

    public No(int info) {
        this.info = info;
        this.proximo = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No [info=" + info + "]";
    }

    // Isso é um POJO (Plain Old Java Object)
    // POJO é uma classe simples, que não possui dependências de frameworks, bibliotecas, etc.

    // RELEMBRANDO: Get -> Consultar, Set -> Alterar
}