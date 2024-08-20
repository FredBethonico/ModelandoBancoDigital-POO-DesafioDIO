import BancoDigital.*;

public class Main {
    public static void main(String[] args) {
        // Instanciar o objeto Banco
        Banco banco = new Banco("Banco Nacional");
        
        // Instanciar os objetos Cliente
        Cliente fred = new Cliente("Fred");
        Cliente nay = new Cliente("Nay");
        Cliente veronica = new Cliente("Veronica");
        Cliente marci = new Cliente("Marci");

        // Instanciar as contas dos clientes
        Conta ccFred = new ContaCorrente(fred);
        Conta cpFred = new ContaPoupanca(fred);
        Conta ccNay = new ContaCorrente(nay);
        Conta cpNay = new ContaPoupanca(nay);
        Conta ccVeronica = new ContaCorrente(veronica);
        Conta cpVeronica = new ContaPoupanca(veronica);
        Conta ccMarci = new ContaCorrente(marci);
        Conta cpMarci = new ContaPoupanca(marci);

        // Atribuir contas ao sistema do banco
        banco.adicionarContas(ccFred, cpFred, ccNay, cpNay, ccVeronica, cpVeronica, ccMarci, cpMarci);

        banco.exibirContas();
    }
}
