package pessoas;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Alice", "Rua X, 123", "111-222-333");
        Pessoa pessoa2 = new Pessoa("Bob", "Rua Y, 456", "444-555-666");

        System.out.println("Pessoa 1 - Nome: " + pessoa1.getNome());
        System.out.println("Endereço: " + pessoa1.getEndereco());
        System.out.println("Telefone: " + pessoa1.getTelefone());

        System.out.println("Pessoa 2 - Nome: " + pessoa2.getNome());
        System.out.println("Endereço: " + pessoa2.getEndereco());
        System.out.println("Telefone: " + pessoa2.getTelefone());

        Fornecedor fornecedor1 = new Fornecedor("Fornecedor A", "Rua A, 123", "123-456-789", 10000.0, 5000.0);
        Fornecedor fornecedor2 = new Fornecedor("Fornecedor B", "Rua B, 456", "987-654-321", 8000.0, 2000.0);
        Fornecedor fornecedor3 = new Fornecedor("Fornecedor C", "Rua C, 789", "555-123-789", 15000.0, 10000.0);
        Fornecedor fornecedor4 = new Fornecedor("Fornecedor D", "Rua D, 567", "111-222-333", 5000.0, 2000.0);

        System.out.println("Fornecedor 1 - Nome: " + fornecedor1.getNome());
        System.out.println("Saldo do Fornecedor 1: " + fornecedor1.obterSaldo());

        System.out.println("Fornecedor 2 - Nome: " + fornecedor2.getNome());
        System.out.println("Saldo do Fornecedor 2: " + fornecedor2.obterSaldo());

        System.out.println("Fornecedor 3 - Nome: " + fornecedor3.getNome());
        System.out.println("Saldo do Fornecedor 3: " + fornecedor3.obterSaldo());

        System.out.println("Fornecedor 4 - Nome: " + fornecedor4.getNome());
        System.out.println("Saldo do Fornecedor 4: " + fornecedor4.obterSaldo());
    }
}
