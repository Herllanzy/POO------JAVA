public class Principal {
    public static void main(String[] args) {
        CadastroPagamento cadastro = new CadastroPagamento();

        cadastro.adicionar(new Pix("Herllan", 100.00, "13316364420"));
        cadastro.adicionar(new CartaoDeCredito("Emilly", 85.30, 12));
        cadastro.adicionar(new Boleto("Pedro", 99.90, "74891.54656.876758.89987" ));
        cadastro.adicionar(new Pix("Thayná", 50.00, "782576527982" ));

        cadastro.imprimirPagamentos();

        System.out.printf("Total geral: %.2f%n", cadastro.calcularTotal());
    }
}