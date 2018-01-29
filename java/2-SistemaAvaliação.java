/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaAvaliação;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Avaliacao {
    
    public static void main(String[] args){
       
        String nomeAluno, nomeDisciplina;
        float nota1, nota2, nota3, media, i, = 0;
         
        Scanner entradaDados = new Scanner(System.in);
        
        for(i = 0; i <3; i++){
            // nome do sistema
            System.out.println("PROGRAMA DE AVALIAÇÃO ESTUDANTIL\n");
        
            //recebe o nome do aluno
            Scanner nomeAluno = new Scanner(System.in);
            System.out.println("Digite o nome do aluno: \n");
            String nome = nomeAluno.nextLine();

            // recebe o nome da disciplina
            Scanner nomeDisciplina = new Scanner(System.in);
            System.out.println("\nDigite o nome da disciplina\n");
            String disciplina = nomeDisciplina.nextLine();

            // recebe a 1º nota
            Scanner nota1 = new Scanner(System.in);
            System.out.println("digite a nota da primeira avaliação em " +disciplina+ " do aluno " +nome+ "\n");
            float n1 = nota1.nextFloat();

            // recebe a 2º nota
            Scanner nota2 = new Scanner(System.in);
            System.out.println("digite a nota da segunda avaliação em " +disciplina+ " do aluno " +nome+ "\n");
            float n2 = nota2.nextFloat();

             // recebe a 2º nota
            Scanner nota3 = new Scanner(System.in);
            System.out.println("digite a nota da terceira avaliação em " +disciplina+ " do aluno " +nome+ "\n");
            float n3 = nota3.nextFloat();

            //resultado da avaliação
            media = (n1+n2+n3) / 3;
            System.out.println("\nO aluno  " + nome + " que esta matriculado na disciplina " + disciplina+" teve a média" + media + " \n"  );
            
            // mostra o resultado do aluno
            if( (media >= 5) && (media <7) ){
                System.out.println("o aluno esta em RECUPERAÇÃO");
            } else if(media > 7){
                System.out.println("o aluno esta APROVADO");
            } else if(media < 7){
                System.out.println("o aluno esta REPROVADO");
            }
        }
    }  
    
}

   
