public class Jogo {
    public static void main(String[] args) throws InterruptedException {
        //Constroi um novo objeto de uma classe
        Personagem cacador = new Personagem("Breno", 10, 0, 0);
        //Criamos um objeto da classe Personagem chamado caçador, já com valor iniciais para seus atributos: nome = Breno, energia = 10, fome = 0 e sono = 0
    
        while (true) {
            cacador.cacar();
            cacador.comer();
            cacador.dormir();
            cacador.cacar();
            cacador.cacar();
            cacador.cacar();
            System.out.println("====================");
            Thread.sleep(5000);
        }

    }
}
