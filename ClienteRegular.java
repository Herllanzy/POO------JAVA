public class ClienteRegular extends Cliente {

     public ClienteRegular(String nome, double valorDaCompra){
       super(nome, valorDaCompra);
    }

    @Override
    public  double calcularPagamento(){
        return valorDaCompra;
    }
    
    @Override
    public String toString() {
        return String.format("Regular - %s | Pagamento: %.2f", nome, calcularPagamento());
    }

    public void imprimirClientesRegulares(){
        toString();
    }
}
