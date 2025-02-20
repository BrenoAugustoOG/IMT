public class TesteVetor {
    public static void main(String[] args) {
        // int [] v1, v2; -> aqui ambas são vetores de inteiros
        // int v1[], v2; -> aqui v1 é um vetor de inteiros e v2 é um inteiro
        NossoVetor v1 = new NossoVetor();
        NossoVetor v2 = new NossoVetor(6);

        // v1.ocupacao =23; -> atributo private, não pode ser acessado
        int i = 10;
        while (!v2.estaCheio()) {
            // System.out.println(i);
            v2.inserir(i++);
        }

        System.out.println(v2);
        System.out.println();

        while (!v1.estaCheio()) {
            v1.inserir(i++);
            // System.out.println(i);
        }
        System.out.println(v1);
    }
}
