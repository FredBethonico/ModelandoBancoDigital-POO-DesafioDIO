package BancoDigital;
public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1; 
    private static int SEQUENCIAL = 1; // para criar um valor sequencial que não se perde ao instanciar um novo o

    protected String tipoConta;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta (String tipo, Cliente cliente) {
        this.tipoConta = tipo;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
                
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
                
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void verificarSaldo(){
        
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));    
        System.out.println(String.format("Numero: %d", this.numero));    
        System.out.println(String.format("Conta: %.2f", this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipoConta() {
        return tipoConta;
    }
    

    @Override
    public String toString() {
        return "Conta de numero: " + numero + "\nCliente: " + cliente.getNome() + "\n" + this.getTipoConta() + "\nAgencia: " + agencia + ", Numero da Conta: " + numero + "\n";
    }

    
    
}
