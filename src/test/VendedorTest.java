package test;

import pessoas.Vendedor;

public class VendedorTest {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("Lucas", "Rua G, 123", "111-222-333", 7, 2000.0, 10.0, 10000.0, 5.0);
        Vendedor vendedor2 = new Vendedor("Lara", "Rua H, 456", "444-555-666", 8, 2500.0, 15.0, 15000.0, 7.5);

        System.out.println("Vendedor 1 - Nome: " + vendedor1.getNome());
        System.out.println("Código Setor: " + vendedor1.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor1.getSalarioBase());
        System.out.println("Imposto: " + vendedor1.getImposto());
        System.out.println("Valor Vendas: " + vendedor1.getValorVendas());
        System.out.println("Comissão: " + vendedor1.getComissao());
        System.out.println("Salário Líquido: " + vendedor1.calcularSalario());

        System.out.println("Vendedor 2 - Nome: " + vendedor2.getNome());
        System.out.println("Código Setor: " + vendedor2.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor2.getSalarioBase());
        System.out.println("Imposto: " + vendedor2.getImposto());
        System.out.println("Valor Vendas: " + vendedor2.getValorVendas());
        System.out.println("Comissão: " + vendedor2.getComissao());
        System.out.println("Salário Líquido: " + vendedor2.calcularSalario());
    }
}
