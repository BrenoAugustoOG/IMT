public class TesteGenerics{
    public static void main(String[] args) {
        VetorDinamico <String> v1 = new VetorDinamico<>();
        VetorDinamico <Integer> v2 = new VetorDinamico<>();
        v1.adicionar("abc");
        v2.adicionar(1);
    }
}