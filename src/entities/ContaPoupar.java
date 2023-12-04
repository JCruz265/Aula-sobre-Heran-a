package entities;

public class ContaPoupar extends Conta{
    private Double taxaJuros;

    public ContaPoupar() {
        super();
    }

    public ContaPoupar(Integer numero, String titular, Double saldo, Double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    public void saldoAtual(){
        saldo += saldo*taxaJuros;
    }
}
