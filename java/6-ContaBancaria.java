/*
 * EXERCICIO 6
 */
package ContaBancaria;

/**
 *
 * @author Fernando
 */
public class Conta {
    
    
    int numero;
    String dono;
    double saldo;
    double limite;
    
    boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
            
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    
    void deposita(double valor) {
        this.saldo += valor;
        
    }
    void saca(String xxx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    void deposita(String xxx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}


/*
 * EXERCICIO 6
 */
package ContaBancaria;

/**
 *
 * @author Fernando
 */
public class ProgramaBanco {
    //método principal.
    public static void main(String[] args) {
        
        Conta minhaConta;
        
        minhaConta = new Conta();
        minhaConta.dono = "Renato";
        minhaConta.saldo = "xxx";
        
        //verificar saldo atual
        System.out.println("Saldo atual é: " + minhaConta.saldo);
        
        //saca quanto quiser
        minhaConta.saca("xxx");
        System.out.println(minhaConta.saldo);
        
        //deposita xxx reais
        minhaConta.deposita("xxx");
        System.out.println(minhaConta.saldo);
        
    }
    
}
