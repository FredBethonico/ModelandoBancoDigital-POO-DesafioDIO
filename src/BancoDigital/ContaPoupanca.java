package BancoDigital;
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super("Conta Poupanca", cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();    
    }


}
