numero 5
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lanchonete {

    /**
     * @param args the command line arguments
     */
    public static void menu(){
        System.out.println("\tMenu da Lanchonete");
        System.out.println("Codigo   Produtos           Preco");
        System.out.println("100      Cachorro Quente    3.50");
        System.out.println("101      Sorvete            1.50");
        System.out.println("102      Hamburguer         4.00");
        System.out.println("103      Cheeseburguer      3.00");
        System.out.println("104      Refrigerante       3.50");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        menu();
        
        int fechaConta = 1;
        int codProduto = 0, qtdeProduto = 0;
        double preco, valorTotal = 0, valorEntrada = 0, valorTroco = 0;
        Scanner ent = new Scanner(System.in);
        
        while (fechaConta != 0) {
            System.out.println("Digite o codigo do produto:");
            codProduto = ent.nextInt();
            
            System.out.println("Digite a quantidade:");
            qtdeProduto = ent.nextInt();
            
            if (codProduto == 100) {
                valorTotal = valorTotal + (3.50 * qtdeProduto);
            }
            else if (codProduto == 101) {
                valorTotal = valorTotal + (1.50 * qtdeProduto);
            }
            else if (codProduto == 102) {
                valorTotal = valorTotal + (4.00 * qtdeProduto);
            }
            else if (codProduto == 103) {
                valorTotal = valorTotal + (3.00 * qtdeProduto);
            }
            else if (codProduto == 104) {
                valorTotal = valorTotal + (3.50 * qtdeProduto);
            }
                                    
            System.out.println("Se desejar encerrar a conta, digite 0");
            fechaConta = ent.nextInt();
            
            if (fechaConta == 0) {
                System.out.println("Valor total a pagar eh " + valorTotal);
                System.out.println("Qual o valor pago?");
                valorEntrada = ent.nextDouble();
                
                valorTroco = valorEntrada - valorTotal;
                
                System.out.println("Troco eh de " + valorTroco);
                
                break;
            }
              
            
        }
        
        
    }
    
}