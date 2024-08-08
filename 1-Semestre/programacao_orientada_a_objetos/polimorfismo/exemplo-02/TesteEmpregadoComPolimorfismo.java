import java.util.Random;

public class TesteEmpregadoComPolimorfismo {
    public class TesteComPolimorfismo {
        public static void main(String[] args) {
            Random gerador = new Random ();
            Empregado [] empregados = new Empregado[10];
            for (int i = 0; i < empregados.length; i++) {
            int tipo = gerador.nextInt(4) + 1;
            switch (tipo) {
            case 1:{
                double salario = gerador.nextDouble() * 1500 + 500;
                empregados[i] = new EmpregadoAssalariado(salario);
                break;
            }
            case 2:{
                double salario = gerador.nextDouble() * 1200 + 300;
                double comissao = gerador.nextDouble();
                empregados[i] = new
                EmpregadoAssalariadoComissionado(salario, comissao);
                break;
            }
            case 3:{
                double salario = gerador.nextDouble() * 1200 + 300;
                double comissao = gerador.nextDouble();
                double bonus = gerador.nextDouble() * 500;
                empregados[i] = new EmpregadoAssalariadoComissionadoBonificado(salario, comissao, bonus);
                break;
            }
            case 4:{
                int numeroHoras = gerador.nextInt(101) + 60;
                double valorHora = gerador.nextDouble() * 20 + 30;
                empregados[i] = new EmpregadoHorista(valorHora, numeroHoras);
            }
            int tipo = gerador.nextInt(5) + 1;
            case 5: {
                int numeroTarefas = 1000 + gerador.nextInt(501);
                double valorTarefa = gerador.nextDouble() * 60 + 20;
                empregados[i] = new EmpregadoTarefeiro (valorTarefa, numeroTarefas);
            }
        }
    }
            //faz as contas, está de acordo com o princípio aberto fechado
            for (int i = 0; i < empregados.length; i++) {
                System.out.printf("Empregado %d: %.2f\n", i + 1,
            //polimorfismo dinâmico acontece nessa linha de código
            empregados[i].calculaSalario());
            }
        }
    }
        
}
