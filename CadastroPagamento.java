public class CadastroPagamento {
    
    private Pagamento [] pagamentos  = new Pagamento[50];
    private int quantidade = 0;

    public void adicionar(Pagamento pagamento){
        if(quantidade < pagamentos.length){
            pagamentos[quantidade] = pagamento;
            quantidade++;
        }else{
            System.out.println("Limite de pagamentos atingidos");
        }
    }

    public double calcularTotal(){
        double total = 0.0;
        for (int i = 0; i < quantidade; i++) {
            total += pagamentos[i].processarPagamento();
        }
        return total;
    }

    public void imprimirPagamentos(){
        System.out.println("======== Relatório de Pagamentos ========");
        for (int i = 0; i < quantidade; i++) {
            Pagamento pagamento = pagamentos[i];
            System.out.printf("%d) %s \n", i + 1, pagamento.toString());
        }
    }
}
