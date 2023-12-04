package entities;

public class ContaEmpresa extends Conta{
    //Atributo não herdado
    private Double limiteEmprestimo;
    public ContaEmpresa(){
        super();
    }//Construtor Padrão
    public ContaEmpresa(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }//Construtor com Argumentos herdados mais atributo proprio
    //Metodos para (re)definir atributos
    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }//fim dos metodos setter's
    // Metodos para acessar os atributos dos objetos

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }//fim dos metodos getter's
    // Metodos para emprestimo
    public void emprestimo(double quantia){
        if(quantia <= limiteEmprestimo){
            saldo += quantia -10;
        }
    }//fim do metodo emprestimo
}
