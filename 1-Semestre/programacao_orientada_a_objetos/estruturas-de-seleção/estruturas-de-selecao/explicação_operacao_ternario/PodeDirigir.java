public class PodeDirigir{
    public static void main(String[] args) {
        //nome completamente qualificado da classe
        //fully qualified name
        
        //java.util.Scanner podendo ser utilizado no local dele o var (operador de interferência de tipo(somente a partir da versão 10))
        //feito pelo compilador
        var leitor = new java.util.Scanner(System.in);
        System.out.println("Sua idade: ");
        var idade = leitor.nextShort();

        //agora fazendo if e else
        if(idade >=18)
            System.out.println("Sim");
        else
            System.out.println("Não");

        System.out.println(idade >=18 ? "Sim" : "Não");
    }
}