public class Teste{
    
    public static void main(String[] args) {
        Mercadinho m = new Mercadinho();


        m.adicionarCliente(new ClienteOuroVip("Herllan", 5000, "2210", "Alagoa Grande"));
        m.adicionarCliente(new ClienteRegular("Pedro", 1069));
        m.adicionarCliente(new ClienteOuroVip("Barros", 10000, "9156", "Patos"));
        m.adicionarCliente(new ClienteVip("Thayná", 1951, "2012"));
        m.adicionarCliente(new ClienteVip("Emilly", 2019, "2911"));

        m.imprimirClientes();
    }
}