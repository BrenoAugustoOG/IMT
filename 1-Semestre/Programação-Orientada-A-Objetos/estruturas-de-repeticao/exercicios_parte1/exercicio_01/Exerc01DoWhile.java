public class Exerc01DoWhile {
    public static void main(String[] args) {
        int contador = 1;
        do {
            System.out.println(contador);
            contador++;
        }
        while (contador <= 100);
    }
}
//o ++contador fará o inverso, então nesse caso primeiro ele fará a conta para depois ver se a condição dele é verdadeira ou falsa
//contador = contador+1 é a mesma coisa que contador+=1;
//no caso do DO/WHILE, o operador while sempre será fora do contexto do DO