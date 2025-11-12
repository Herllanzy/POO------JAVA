public class ClienteOuroVip extends ClienteVip{

    private final String endereco;

    public ClienteOuroVip(String nome, double valorDaCompra, String numeroCartao, String endereco){
        super(nome, valorDaCompra, numeroCartao);
        this.endereco = endereco;
    }

    @Override
    public double calcularPagamento(){
        return valorDaCompra - valorDaCompra * 0.15;
    }
    @Override
    public String toString() {
        return String.format("OuroVIP - %s | Número do cartão: %s | Endereço: %s | Pagamento: %.2f", nome, numeroCartao, endereco, calcularPagamento());
    }

    public void imprimirClientesOuroVips(){
        toString();
    }
}