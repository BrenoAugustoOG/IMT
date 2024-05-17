public class Exerc01While {
    public static void main(String[] args) {
        //repetição controlada por contador
        //3 partes:
        //delaração/inicialização
        int contador = 1;
        //teste de continuidade
        while (contador <= 100 ) {
            //atualização/incremento
            System.out.println(contador);
            contador = contador +1;
        }
    }
}
//o ++contador fará o inverso, então nesse caso primeiro ele fará a conta para depois ver se a condição dele é verdadeira ou falsa
//contador = contador+1 é a mesma coisa que contador+=1;