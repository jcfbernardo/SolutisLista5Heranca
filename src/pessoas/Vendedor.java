package pessoas;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor,
                    double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        setValorVendas(valorVendas);
        setComissao(comissao);
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioEmpregado = super.calcularSalario();
        double valorComissao = (valorVendas * comissao) / 100.0;
        return salarioEmpregado + valorComissao;
    }

}
