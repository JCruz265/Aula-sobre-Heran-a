package entities;

public class ContaPoupar extends Conta {
    private Double taxaJuros;

    public ContaPoupar() {
        super();
    }//Construtor Padrão

    public ContaPoupar(Integer numero, String titular, Double saldo, Double limite, Double taxaJuros) {
        super(numero, titular, saldo, limite);
        this.taxaJuros = taxaJuros;
    }
    //Construtor com Argumentos herdados mais atributo proprio

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void saldoAtual() {
        saldo += saldo * taxaJuros;
    }

    //metodo de saque
    @Override
    public final void saque(double quantia) {
        saldo -= quantia;
    }//fim metodo de saque

}
