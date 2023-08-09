package pessoas;

public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        setCodigoSetor(codigoSetor);
        setSalarioBase(salarioBase);
        setImposto(imposto);
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * (imposto / 100.0));
    }

}
