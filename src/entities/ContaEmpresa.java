package entities;

public class ContaEmpresa extends Conta {
    //Atributo não herdado
    private Double limiteEmprestimo;

    public ContaEmpresa() {
        super();
    }//Construtor Padrão

    public ContaEmpresa(Integer numero, String titular, Double saldo, Double limite, Double limiteEmprestimo) {
        super(numero, titular, saldo, limite);
        this.limiteEmprestimo = limiteEmprestimo;
    }//Construtor com Argumentos herdados mais atributo proprio

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }//fim dos metodos getter's
// Metodos para acessar os atributos dos objetos

    //Metodos para (re)definir atributos
    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }//fim dos metodos setter's

    // Metodos para emprestimo
    public void emprestimo(double quantia) {
        if (quantia <= limiteEmprestimo) {
            saldo += quantia - 10;
        }
    }//fim do metodo emprestimo

    //metodo de saque
    @Override
    public final void saque(double quantia) {
        super.saque(quantia);
        saldo -= 2;
    }//fim metodo de saque

}
