public class Personagem{
    //atributos: características/dados da classe
    private String nome;
    private int energia, fome, sono;

    public Personagem (String nome, int energia, int fome, int sono){
        this.nome = nome;
        if (energia >= 0 && energia <= 10){
            this.energia = energia;
        }
        if(fome >= 0 && fome <= 10){
            this.fome = fome;
        }
        if (sono >= 0 && sono <= 10){
            this.sono = sono;
        }
    }
    public String getNome() {
        return nome;
    }
    //get = retorna o valor atual de um atributo
    public int getEnergia() {
        return energia;
    }
    //set = recebe um valor por parâmetro e atualiza o valor de um atributo
    public void setEnergia(int energia) {
        if (energia >= 0 && energia <= 10) {
            this.energia = energia;
        }
    }

    //métodos: funções/comportamentos da classe
    public void cacar(){
        if (energia >= 2) {
            System.out.println(nome + " está caçando!");
            energia -= 2; //energia = energia -1
        }
        else { //energia < 2    
            System.out.println(nome + " esta sem " + "energia suficiente para caçar.");    
        }
        fome = Math.min(fome+1,10);
        sono = Math.min(sono+1,10);
    }

    public void comer(){
        if (fome >= 1) {
            System.out.println(nome + " está comendo!");
            energia = Math.min(energia+1,10);
            fome = fome - 1;    
        }
        else{ //fome < 1
            System.out.println(nome + " está satisfeito!");
        }
        
    }
    public void dormir(){
        if (sono >= 1) {
            System.out.println(nome + " está dormindo!");
            sono = sono - 1;
            energia = Math.min(energia+1,10);
        }
        else{ //sono < 1
            System.out.println(nome + " já está descansado!");
        }
    }
    
    public String toString(){
        return String.format(
            "%s: (Energia: %d, Fome: %d, Sono: %d)" ,
            nome, energia, fome, sono
        );
    }
}