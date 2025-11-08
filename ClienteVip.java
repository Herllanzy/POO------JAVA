public class ClienteVip extends Cliente{

    protected  String numeroCartao;

    public ClienteVip(String nome, double valorDaCompra, String numeroCartao){
        super(nome, valorDaCompra);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public double calcularPagamento(){
        return valorDaCompra - valorDaCompra * 0.1;
    }
    @Override
    public String toString() {
        return String.format("VIP - %s | Código: %s | Pagamento: %.2f", nome, numeroCartao, calcularPagamento());
    }

    public void imprimirClientesVips(){
        toString();
    }
}


