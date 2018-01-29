/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoarea;
import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class CalculoArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner ent = new Scanner(System.in);
         int opcao = 0;
         double lado, area, base, altura, lado1, lado2, lado3;
         
         System.out.println("Escolha opçoes de 1 a 3, conforme instruçoes a seguir:");
         System.out.println("Quadrado - Tecle 1 / Retangulo - Tecle 2 / Triangulo - Tecle 3");
         
         opcao = ent.nextInt();
         
         while (opcao != 0) {
             if (opcao == 1){
                 System.out.println("Entre com o valor do lado do quadrado:");
                 lado = ent.nextDouble();
                 
                 area = lado * 4;
                 
                 System.out.println("A area do quadrado eh " + area);
                 opcao = 0;
             }
             else if (opcao == 2) {
                System.out.println("Entre com a base do retangulo:");
                base = ent.nextDouble();
                
                System.out.println("Entre com a altura do retangulo:");
                altura = ent.nextDouble();
                
                area = base * altura;
                
                System.out.println("A area do retangulo eh " + area);
                opcao = 0;
             }
             else if (opcao == 3) {
                System.out.println("Entre com o lado 1 do triangulo:");
                lado1 = ent.nextDouble();
                
                System.out.println("Entre com o lado 2 do triangulo:");
                lado2 = ent.nextDouble();
                
                System.out.println("Entre com o lado 3 do triangulo:");
                lado3 = ent.nextDouble();
                
                area = lado1 + lado2 + lado3;
                
                System.out.println("A area do triangulo eh " + area);
                opcao = 0;
             }
         }
 
 }
    