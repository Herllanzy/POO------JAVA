public class Mercadinho {

    private final Cliente[] clientes = new Cliente[10]; 
    private int quantidade = 0; 

    public void adicionarCliente(Cliente cliente) {
        if (quantidade < clientes.length) {
            clientes[quantidade] = cliente;
            quantidade++;
        } else {
            System.out.println("Limite de clientes atingido.");
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (int i = 0; i < quantidade; i++) {
            if (clientes[i] != null) {
                total += clientes[i].calcularPagamento();
            }
        }
        return total; 
    }

    public void imprimirClientes() {
        if (quantidade == 0) {
            System.out.println("Nenhum cliente cadastrado.");
        }

        System.out.println("===== Relatório de Clientes =====");
        for (int i = 0; i < quantidade; i++) {
            Cliente cliente = clientes[i];
            if (cliente != null) {
                System.out.printf("%d) %s \n", i + 1, cliente.toString());
            }
        }
        System.out.printf("Total geral: %.2f \n", calcularTotal());
    }
}