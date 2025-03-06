import java.util.Scanner;

public class TesteVetor {
    static Scanner scanner;

    static int menu() {
        System.out.print("Opção: \n");
        System.out.println("1 - Insere");
        System.out.println("2 - Remove");
        System.out.println("3 - Exibir");
        System.out.println("0 - Sair");
        return scanner.nextInt();
    }

    // Aqui declaramos como se o Scanner fosse um atributo da classe
    public static void main(String[] args) {
        NossoVetor v1 = new NossoVetor();
        NossoVetor v2 = new NossoVetor(4);
        scanner = new Scanner(System.in);
        // v1.ocupacao = 23; atributo private, não pode ser acessado
        // int i = 10;
        // while (!v2.estaCheio()) {
        // System.out.println(i);
        // v2.insere(i++);
        // }
        // System.out.println(v2);
        // System.out.println();
        // while (!v1.estaCheio()) {
        // v1.insere(++i);
        // System.out.println(i);
        // }
        // System.out.println(v1);

        int opcao = menu();
        while (opcao > 0) {
            switch (opcao) {
                case 1:
                    System.out.println("Digite um número: ");
                    v1.insere(scanner.nextInt());
                    // int i = scanner.nextInt();
                    // v1.insere(i);
                    break;
                case 2:
                    if (!v1.estaVazio())
                        System.out.println(v1.remove() + " foi removido!");
                    else
                        System.out.println("Vetor vazio!");
                    break;
                case 3:
                    System.out.println(v1);
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
            opcao = menu();
        }
        System.out.println("Obrigado por usar meu programa!");
        scanner.close();
    }
}