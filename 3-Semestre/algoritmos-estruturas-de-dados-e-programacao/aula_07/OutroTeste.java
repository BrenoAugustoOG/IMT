import java.util.Random;

public class OutroTeste {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor(6);
        Random random = new Random();
        for (int i = 1; i < 100; i++) {
            if (random.nextBoolean()) {
                v.insere(i);
            } else {
                try {
                    System.out.println(v.remove() + " foi removido!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Tamanho = " + v.getTamanho());
                System.out.println(v);
            }
        }
        if (v.contem(10))
            System.out.println("O vetor contém o número 10!");
        else
            System.out.println("O vetor não contém o número 10!");
        try {
            int posicao = v.indiceDe(10);
            System.out.println("O número 10 está na posição " + posicao + "!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
