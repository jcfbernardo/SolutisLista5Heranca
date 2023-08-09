package pessoas;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor,
                    double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        setValorProducao(valorProducao);
        setComissao(comissao);
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioEmpregado = super.calcularSalario();
        double valorComissao = (valorProducao * comissao) / 100.0;
        return salarioEmpregado + valorComissao;
    }

}
