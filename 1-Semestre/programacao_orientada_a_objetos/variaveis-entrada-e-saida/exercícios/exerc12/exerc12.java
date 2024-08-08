import javax.swing.*;
import java.util.*;

public class exerc12{
    public static void main(String [] args) {
        //Declaração
        Scanner leitor = new Scanner(System.in);
        
        //float: 4 bytes, double: 8 bytes
        float x1, x2, y1, y2; //Variáveis de entrada
        float distancia; //Variável de saída

        //Entrada de Dados
        System.out.println("Digite x1:");
        x1 = leitor.nextFloat();
        System.out.println("Digite x2: ");
        x2 = leitor.nextFloat();
        System.out.println("Digite y1: ");
        y1 = leitor.nextFloat();
        System.out.println("Digite y2: ");
        y2 = leitor.nextFloat();

        //Processamento
        distancia = (float) Math.sqrt(Math.pow(y2 - y1, 2)+ Math.pow(x2 - x1, 2));

        //Saída de Dados
        //A distancia entre p1(x1 ,y1) e p2(x2,y2) é: distancia
        
        //Usando Println e de forma extensa, mostrando (x1,x2,y1,y2)
        System.out.println("A distancia entre p1(" + x1 + " , " + y1 + ") e p2(" + x2 + " , " + y2 + ") é: " + distancia);

        //Usando Printf e de forma extensa, mostrando (x1,x2,y1,y2)
        System.out.printf(
            "A distância entre p1(%f, %f) e p2(%f , %f) é: %f", x1, y1, x2, y2, distancia
        ); 

    }
}

//aviso do javac, fazer em casa*