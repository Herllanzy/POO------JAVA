public class Boleto extends Pagamento{
    
    private final String  linhaDigitavel;

    public Boleto(String nomeCliente, double valor, String linhaDigitavel){
        super(nomeCliente, valor);
        this.linhaDigitavel = linhaDigitavel;
    }

    @Override
    public double processarPagamento(){
        return getValor() + (getValor() * 0.015);
    };

     @Override
    public String toString(){
        return String.format("Nome: %s | Valor da Compra: %.2f | Linha Digitável: %s", getNomeCliente(), processarPagamento(), linhaDigitavel);
    }
}
