package test;

import pessoas.Operario;

public class OperarioTest {
    public static void main(String[] args) {
        Operario operario1 = new Operario("Pedro", "Rua E, 123", "111-222-333", 5, 2500.0, 10.0, 5000.0, 5.0);
        Operario operario2 = new Operario("Ana", "Rua F, 456", "444-555-666", 6, 3000.0, 15.0, 7000.0, 7.5);

        System.out.println("Operário 1 - Nome: " + operario1.getNome());
        System.out.println("Código Setor: " + operario1.getCodigoSetor());
        System.out.println("Salário Base: " + operario1.getSalarioBase());
        System.out.println("Imposto: " + operario1.getImposto());
        System.out.println("Valor Produção: " + operario1.getValorProducao());
        System.out.println("Comissão: " + operario1.getComissao());
        System.out.println("Salário Líquido: " + operario1.calcularSalario());

        System.out.println("Operário 2 - Nome: " + operario2.getNome());
        System.out.println("Código Setor: " + operario2.getCodigoSetor());
        System.out.println("Salário Base: " + operario2.getSalarioBase());
        System.out.println("Imposto: " + operario2.getImposto());
        System.out.println("Valor Produção: " + operario2.getValorProducao());
        System.out.println("Comissão: " + operario2.getComissao());
        System.out.println("Salário Líquido: " + operario2.calcularSalario());
    }
}
