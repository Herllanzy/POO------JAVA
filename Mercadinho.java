// ...existing code...
public class Mercadinho {

    private final Cliente[] clientes = new Cliente[10]; // vetor de tamanho 10
    private int quantidade = 0; // controla quantos clientes foram adicionados

    public void adicionarCliente(Cliente cliente) {
        if (cliente == null) return; // evita adicionar null
        if (quantidade < clientes.length) { // se ainda houver espaço
            clientes[quantidade++] = cliente; // adiciona e incrementa quantidade
        } else {
            System.out.println("Limite de clientes atingido.");
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (int i = 0; i < quantidade; i++) { // percorre apenas clientes cadastrados
            if (clientes[i] != null) {
                total += clientes[i].calcularPagamento(); // soma o pagamento de cada cliente
            }
        }
        return total; // retorna o total calculado
    }

    public void imprimirClientes() {
        if (quantidade == 0) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        System.out.println("===== Relatório de Clientes =====");
        for (int i = 0; i < quantidade; i++) { // imprime somente posições preenchidas
            Cliente cliente = clientes[i];
            if (cliente != null) {
                System.out.printf("%d) %s \n", i + 1, cliente.toString());
            }
        }
        System.out.printf("Total geral: %.2f \n", calcularTotal());
    }
}
// ...existing code...