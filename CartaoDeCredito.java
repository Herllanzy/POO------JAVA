public class CartaoDeCredito extends Pagamento {

    private final int quantidadeParcelas;

    public CartaoDeCredito(String nomeCliente, double valor, int quantidadeParcelas){
        super(nomeCliente, valor);
        this.quantidadeParcelas = quantidadeParcelas;
    }

    @Override
    public double processarPagamento(){
        return getValor() + (getValor() * (2 * quantidadeParcelas)/100);
    };

     @Override
    public String toString(){
        return String.format("Nome: %s | Valor da Compra: %.2f | Quantidade de Parcelas: %s", getNomeCliente(), processarPagamento(), quantidadeParcelas);
    }
}
