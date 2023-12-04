package entities;

public class Conta {
    //Declarar atributos
    private Integer numero;
    private String titular;
    protected Double saldo;
    public Conta(){}//Construtor Padrão
    public Conta(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }//Construtor com Argumentos
    //Metodos para (re)definir os atributos

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //fim dos metodos setter's
    // Metodos para acessar os atributos dos objetos

    public Integer getNumero() {
        return numero;
    }


    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }
    //fim dos metodos getter's
    //metodo de saque
    public void saque(double quantia){
        saldo -= quantia;
    }//fim metodo de saque
    //metodo de deposito
    public void deposito(double quantia){
        saldo += quantia;
    }//fim metodo de saque
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: "+ getTitular());
        sb.append("\nNúmero da conta: "+ getNumero());
        sb.append("\nSaldo: R$"+getSaldo()+" reais");
        return sb.toString();
    }
}
