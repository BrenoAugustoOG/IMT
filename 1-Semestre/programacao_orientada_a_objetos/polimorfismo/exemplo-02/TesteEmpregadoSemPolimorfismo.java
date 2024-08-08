import java.util.Random;
public class TesteEmpregadoSemPolimorfismo {
    public static void main(String[] args) {
        //gera uma base de dados de empregados
        Random gerador = new Random ();
        Empregado [] empregados = new Empregado[10];
    
        //construir o objeto pois cada posição vale null
        for (int i = 0; i < empregados.length; i++) {
            empregados[i] = new Empregado();
            int tipo = gerador.nextInt(4) + 1;
            empregados[i].setTipo(tipo);
            if (tipo == 1)
                empregados[i].setSalario(gerador.nextDouble() * 1000 + 1200);
            else if (tipo == 2) {
                empregados[i].setSalario(gerador.nextDouble() * 800 + 1000);
                empregados[i].setComissao(gerador.nextDouble());
            }
            else if (tipo == 3) {
                empregados[i].setSalario(gerador.nextDouble() * 800 + 800);
                empregados[i].setComissao(gerador.nextDouble());
                empregados[i].setBonus(gerador.nextDouble() * 500);
            }
            else if (tipo == 4) {
                empregados[i].setHorasTrabalhadas(80 + gerador.nextInt(41));
                empregados[i].setValorHora(gerador.nextDouble() * 20 + 30);
            }
        }
    
        //faz as contas
        for (int i = 0; i < empregados.length; i++) {
            double salario = 0;
            if (empregados[i].getTipo() == 1) {
                salario = empregados[i].getSalario();
            }
            else if (empregados[i].getTipo() == 2) {
                salario = empregados[i].getSalario() + empregados[i].getSalario()
                * empregados[i].getComissao();
            }
            else if (empregados[i].getTipo() == 3) {
                salario = empregados[i].getSalario() + empregados[i].getSalario()
                * empregados[i].getComissao() + empregados[i].getBonus();
            }
            else if (empregados[i].getTipo() == 4) {
                salario = empregados[i].getValorHora() *
                empregados[i].getHorasTrabalhadas();
            }
            System.out.printf("Empregado %d: %.2f\n", i + 1, salario);
            } 
        }
    }
