package BancoDigital;
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super("Conta Corrente", cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();    
    }

    

    
}
