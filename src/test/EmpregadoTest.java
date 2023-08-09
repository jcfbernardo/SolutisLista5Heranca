package test;

import pessoas.Empregado;
import pessoas.Administrador;

public class EmpregadoTest {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("João", "Rua A, 123", "111-222-333", 1, 2000.0, 10.0);
        Administrador administrador = new Administrador("Carlos", "Rua C, 789", "777-888-999", 3, 3000.0, 10.0, 500.0);

        System.out.println("Empregado - Nome: " + empregado.getNome());
        System.out.println("Salário Líquido: " + empregado.calcularSalario());

        System.out.println("Administrador - Nome: " + administrador.getNome());
        System.out.println("Salário Líquido: " + administrador.calcularSalario());
    }
}
