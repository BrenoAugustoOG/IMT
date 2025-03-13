import java.util.Calendar;
import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NossoVetor v;
        int t;
        System.out.println("Digite o tamanho do vetor: (0 Encerra)");
        t = scanner.nextInt();
        while (t > 0) {
            v = new NossoVetor(t);
            v.preencheVetor();
            // System.out.println("Vetor original: \n" + v);
            long ini = Calendar.getInstance().getTimeInMillis();
            System.out.println(ini);
            v.bubbleSort();
            long fim = Calendar.getInstance().getTimeInMillis();
            // System.out.println(fim);
            System.out.println("Bubble demorou: " + (fim - ini) + "ms");

            v.preencheVetor();
            ini = Calendar.getInstance().getTimeInMillis();
            v.selectionsort();
            fim = Calendar.getInstance().getTimeInMillis();
            System.out.println("Selection demorou: " + (fim - ini) + "ms");

            v.preencheVetor();
            ini = Calendar.getInstance().getTimeInMillis();
            v.insertionsort();
            fim = Calendar.getInstance().getTimeInMillis();
            System.out.println("Insertion demorou: " + (fim - ini) + "ms");

            ini = Calendar.getInstance().getTimeInMillis();
            v.bubbleSort();
            fim = Calendar.getInstance().getTimeInMillis();
            System.out.println("Bubble ordenado demorou: " + (fim - ini) + "ms");

            ini = Calendar.getInstance().getTimeInMillis();
            v.selectionsort();
            fim = Calendar.getInstance().getTimeInMillis();
            System.out.println("Selection ordenado demorou: " + (fim - ini) + "ms");

            ini = Calendar.getInstance().getTimeInMillis();
            v.insertionsort();
            fim = Calendar.getInstance().getTimeInMillis();
            System.out.println("Insertion ordenado demorou: " + (fim - ini) + "ms");

            System.out.print("\n Escolha o novo tamanho do vetor: (0 Encerra)");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}
