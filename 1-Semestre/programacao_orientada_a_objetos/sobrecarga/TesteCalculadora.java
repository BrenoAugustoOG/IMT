public class TesteCalculadora{
    public static void main(String[] args) {
        var calc = new Calculadora();
        calc.somar(1,2);
        calc.somar(2f,1f);
        calc.somar(1,2,3);
        calc.somar("1", "2");
        calc.somar("1", 2);
        calc.somar(1, "2");
    }
}