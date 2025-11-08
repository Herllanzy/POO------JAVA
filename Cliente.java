public abstract class Cliente{
    
    String nome;
    double valorDaCompra;

    public Cliente(String nome, double valorDaCompra){
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }

    public double getValorDaCompra() {
        return valorDaCompra;
    }

    public abstract double calcularPagamento();
}