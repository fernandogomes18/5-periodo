/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservahotel;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ReservaHotel {

    /**
     * @param args the command line arguments
     */
    
    public static void reserva(){
        System.out.println("\tReserva de Quartos");
        System.out.println("Tipo      Categoria   Preco");
        System.out.println("Basico    Solteiro    80.00");
        System.out.println("Comum     Solteiro    100.00");
        System.out.println("Super     Solteiro    140.00");
        System.out.println("Basico    Casal       120.00");
        System.out.println("Comum     Casal       160.00");
        System.out.println("Super     Casal       200.00");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        reserva();
        
        String nomeCliente = "", tipoQuarto = "", categoria = "";
        int encerraReserva = 1;
        int codProduto = 0, qtdeDiaria = 0;
        double preco, valorTotal = 0, valorEntrada = 0, valorTroco = 0;
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Digite o nome do cliente:");
        nomeCliente = ent.nextLine();
               
        System.out.println("Digite o tipo de quarto:");
        tipoQuarto = ent.nextLine();
        
        System.out.println("Digite a categoria de quarto:");
        categoria = ent.nextLine();
        
        System.out.println("Digite a quantidade de diarias:");
        qtdeDiaria = ent.nextInt();
        
        if ((tipoQuarto == "Basico") && (categoria == "Solteiro")) {
            valorTotal = 80.00 * qtdeDiaria;
            System.out.println("Valor total a pagar eh " + valorTotal);
        }
        else if ((tipoQuarto == "Comum") && (categoria == "Solteiro")) {
            valorTotal = 100.00 * qtdeDiaria;
            System.out.println("Valor total a pagar eh " + valorTotal);
        }
        else if ((tipoQuarto == "Super") && (categoria == "Solteiro")) {
                valorTotal = (140.00 * qtdeDiaria);
        }
        else if ((tipoQuarto == "Basico") && (categoria == "Casal")) {
                valorTotal = (120.00 * qtdeDiaria);
        }
        else if ((tipoQuarto == "Comum") && (categoria == "Casal")) {
                valorTotal = (160.00 * qtdeDiaria);
        }
        else if ((tipoQuarto == "Super") && (categoria == "Casal")) {
                valorTotal = (200.00 * qtdeDiaria);
        }
        
        System.out.println("Cadastro encerrado, aguarde processamento...");
        encerraReserva = 0;
                   
        if (encerraReserva == 0) {
            System.out.println("Valor total a pagar eh " + valorTotal);
            System.out.println("Qual o valor pago?");
            valorEntrada = ent.nextDouble();

            valorTroco = valorEntrada - valorTotal;

            System.out.println("Troco eh de " + valorTroco);

            return;
        }        
        
    }
    
}