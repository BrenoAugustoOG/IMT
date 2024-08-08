public class EmpregadoHorista extends Empregado{
    private double valorHora;
    private int numeroHoras;
    
    @Override
    public double calculaSalario(){
        return this.valorHora*this.numeroHoras;
    }
}
