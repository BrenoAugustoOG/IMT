import java.util.Random;

public class jogoV2{
    public static void main(String [] args) throws InterruptedException {
        var personagem = new Personagem("Pedro", 10 ,0 ,0);
        var gerador = new Random();
        //1 ou 2: caçar
        //3: comer
        //4: dormir
        //faça o personagem morrer (energia == 0)
        while(personagem.getEnergia() > 0){
            int oQueFazer = 1 + gerador.nextInt(4);
            switch (oQueFazer) {
                //lógica em queda (fall-through)
                case 1:
                case 2:
                    personagem.cacar();
                    break;
                case 3:
                    personagem.comer();
                    break;
                case 4:
                    personagem.dormir();
                    break;
            }
            System.out.println(personagem);
            System.out.println("*********************************************************************************");
            Thread.sleep(5000);
        }
        System.out.println(personagem.getNome() + "morreu!");
    }
}