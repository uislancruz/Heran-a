package com.algaworks.banco;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    private double valorTotalRendimentos;

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }


    public void creditarRendimentos(double percentualJuros){
            double valorRendimentos = getSaldo() * percentualJuros / 100;
            this.valorTotalRendimentos += valorRendimentos;
            depositar(valorRendimentos);

    }


    @Override
    public String toString() {
        return "ContaInvestimento{" +
                "titular=" + getTitular() +
                ", agencia=" + getAgencia() +
                ", numero=" + getNumero() + ", valorTotalRendimentos=" + valorTotalRendimentos +
                '}';
    }
}