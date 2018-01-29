/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoPR1;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Avaliacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner ent = new Scanner(System.in);
        int nota1, nota2, nota3;
        int media, i, nomeAluno = 0;
        
        for(i = 0; i < 3; i++){
            
            
            nomeAluno++;
            // recebe a 1º nota
            System.out.println("Aluno " + nomeAluno + ", digite sua 1ª nota");
            nota1 = ent.nextInt();
            
            // recebe a 2º nota
            System.out.println("Aluno " + nomeAluno + ", digite sua 2ª nota");
            nota2 = ent.nextInt();
            
            // recebe a 3º nota
            System.out.println("Aluno " + nomeAluno + ", digite sua 3ª nota");
            nota3 = ent.nextInt();
            
            // calcula a média
            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A média do aluno " + nomeAluno + " é " + media);
            
            // mostra a nota do aluno
            if( (media >= 5) && (media <7) ){
                System.out.println("Recuperação");
            } else if(media > 7){
                System.out.println("Aprovado");
            } else if(media < 7){
                System.out.println("Reprovado");
            }
        }       
    }
}
