import java.util.Calendar;
import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NossoVetor v;
        int t;
        System.out.println("Digite o tamanho do vetor: (0 Encerra)");
        t = scanner.nextInt();
        while (t>0) {
            v = new NossoVetor(t);
            v.preencheVetor();
            // System.out.println("Vetor original: \n" + v);
            long ini = Calendar.getInstance().getTimeInMillis();
            System.out.println(ini);
            v.bubbleSort();
            long fim = Calendar.getInstance().getTimeInMillis();
            System.out.println(fim);
            // System.out.println("Tempo de execução: " + (fim.getTime() - ini.getTime()) + "ms");
            // System.out.println("\nVetor ordenado: \n" + v);
            System.out.print("\n Escolha o novo tamanho do vetor: (0 Encerra)");
            t = scanner.nextInt();
        }
        scanner.close(); 
    }
}
