public abstract  class Pagamento {
    
    private final String nomeCliente;
    private final double valor;

    public Pagamento(String nomeCliente, double valor){
        this.nomeCliente = nomeCliente;
        this.valor = valor;
    }

    public abstract double processarPagamento();

    public double getValor() {
        return valor;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }
}
