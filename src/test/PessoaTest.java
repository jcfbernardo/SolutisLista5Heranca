package test;

import pessoas.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Alice", "Rua X, 123", "111-222-333");
        Pessoa pessoa2 = new Pessoa("Bob", "Rua Y, 456", "444-555-666");

        System.out.println("Pessoa 1 - Nome: " + pessoa1.getNome());
        System.out.println("Endereço: " + pessoa1.getEndereco());
        System.out.println("Telefone: " + pessoa1.getTelefone());

        System.out.println("Pessoa 2 - Nome: " + pessoa2.getNome());
        System.out.println("Endereço: " + pessoa2.getEndereco());
        System.out.println("Telefone: " + pessoa2.getTelefone());
    }
}
