package test;

import pessoas.Fornecedor;

public class FornecedorTest {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor("Fornecedor A", "Rua A, 123", "111-222-333", 10000.0, 5000.0);
        Fornecedor fornecedor2 = new Fornecedor("Fornecedor B", "Rua B, 456", "444-555-666", 8000.0, 2000.0);

        System.out.println("Fornecedor 1 - Nome: " + fornecedor1.getNome());
        System.out.println("Saldo do Fornecedor 1: " + fornecedor1.obterSaldo());

        System.out.println("Fornecedor 2 - Nome: " + fornecedor2.getNome());
        System.out.println("Saldo do Fornecedor 2: " + fornecedor2.obterSaldo());
    }
}
