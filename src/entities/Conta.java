package entities;

import exceptions.NegocioException;

public class Conta {
    //Declarar atributos
    private Integer numero;
    private String titular;
    protected Double saldo;
    private Double limite;

    public Conta() {
    }//Construtor Padrão

    public Conta(Integer numero, String titular, Double saldo, Double limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }//Construtor com Argumentos
    //Metodos para (re)definir os atributos

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
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

    public Double getLimite() {
        return limite;
    }

    //fim dos metodos getter's
    //metodo de deposito
    public void deposito(double quantia) {
        saldo += quantia;
    }//fim metodo de deposito
    public void validarSaque(double quantia) {

        if (quantia > getLimite()) {
            throw new NegocioException("Erro de saque: A quantia excede o limite de saque");
        }
        if (quantia > getSaldo()) {
            throw new NegocioException("Erro de saque: Saldo insuficiente");
        }
    }//fim do metodo de validação de saque
    //metodo de saque
    public void saque(double quantia) {
        validarSaque(quantia);
        saldo -= quantia + 5;
    }//fim metodo de saque
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + getTitular());
        sb.append("\nNúmero da conta: " + getNumero());
        sb.append("\nSaldo: R$" + getSaldo() + " reais");
        return sb.toString();
    }
}
