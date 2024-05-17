import java.util.Random;

public class TesteVetorDinamico {
    public static void main(String[] args) throws InterruptedException{
        VetorDinamico v = new VetorDinamico();
        Random gerador = new Random();

        while(true){
            var oQueFazer = gerador.nextDouble();
            if (oQueFazer <= 0.4){ //remover
                System.out.println("Removendo");
                v.remover();
            }
            else { //adicionar
                int elemento = 1 + gerador.nextInt(6);
                System.out.println("Adicionando");
                v.adicionar(elemento);
            }
            v.exibir();
            Thread.sleep(1000);
            System.out.println("====================");
        }
    }
}