public class NossoVetor {
    private int[] vetor;
    private int ocupacao;
    public NossoVetor(int tamanho) {
        vetor = new int[tamanho];
        ocupacao = 0; 
    }
    
    public NossoVetor() {
        new NossoVetor(10);
    }

    public void inserir(int i) {
        vetor[ocupacao++] = i;
    }

    public boolean estaCheio() {
        return (ocupacao == vetor .length);
        // if (ocupacao == vetor.lenght) {return true};
    }
}

//Classe = modelo (ex. planta de uma casa)
//Objeto = instâncias concretas construídas de acordo com o modelo
//Níveis de acesso = private(mais fechado), default, protected, public(mais aberto)
//Elementos = class, pacote (pasta), herdeiros (não necessariamente estão na mesma pasta), mundo
//Construtor = bloco incial de construção do objeto