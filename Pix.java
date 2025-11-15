public class Pix extends Pagamento {
    
    private final String chave;

    public Pix(String nomeCliente, double valor, String chave){
        super(nomeCliente, valor);
        this.chave = chave;
    }

    @Override
    public double processarPagamento(){
        return getValor();
    };

    @Override
    public String toString(){
        return String.format("Nome: %s | Valor da Compra: %.2f | Chave: %s", getNomeCliente(), processarPagamento(), chave);
    }
}
