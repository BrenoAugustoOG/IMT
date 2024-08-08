import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class ListaDeMusicas {
    public static void main(String[] args) {
        List <Musica> musicas = new ArrayList<>();
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui a opção que deseja selecionar: \n 0- Sair \n 1- Inserir Musica \n 2- Avaliar Música \n 3- Ver lista de músicas ordenada\n"));
            switch(opcao){
                case 0:
                    JOptionPane.showMessageDialog(null,"Até mais!");
                    break;
                
                case 1:
                    //inserir uma nova musica na coleção
                    String musicaInserir = JOptionPane.showInputDialog(null, "Insira aqui uma música na qual deseja adicionar");
                    musicas.add(new Musica(musicaInserir));
                    JOptionPane.showMessageDialog(null,"Musica armazenada com sucesso");
                    break;

                case 2:
                    //avaliar uma música já existente
                    String musicaAvaliar = JOptionPane.showInputDialog(null,"Qual a música que deseja avaliar");
                    int nota = Integer.parseInt(JOptionPane.showInputDialog("Qual a nota que voce dá a ela?"));
                    
                    for (int i = 0; i < musicas.size(); i++){
                        if (musicas.get(i).getTitulo().equals(musicaAvaliar)){
                            musicas.get(i).setAvaliacao(nota);
                            break;
                            }
                        }
                    break;

                case 3:
                    //listam as músicas ordenadas
                    Collections.sort(musicas, Collections.reverseOrder());
                    JOptionPane.showMessageDialog(null, musicas);
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida!");
                    break;
            }
        }while (opcao != 0);
    }
}
