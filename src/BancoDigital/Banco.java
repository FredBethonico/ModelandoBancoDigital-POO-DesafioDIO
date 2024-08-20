package BancoDigital;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    protected String nome;
    protected List<Conta> listaContas;
    
    public Banco(String nome) {
        this.nome = nome;
        this.listaContas = new ArrayList<>();
    }
 
    public void adicionarContas (Conta... contas){
        List<Conta> contasParaAdicionar = List.of(contas);
        listaContas.addAll(contasParaAdicionar);
    }

    public void exibirContas(){
        System.out.println("Quantidade de contas cadastradas: " + listaContas.size() + "\n");
        for(Conta c : listaContas) {
            System.out.println(c);
        }
    }
    
}

