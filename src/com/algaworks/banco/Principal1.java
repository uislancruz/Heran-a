package com.algaworks.banco;

public class Principal1 {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("Joao Da Silva", "12312312300"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);
        conta1.setTipo(Conta.NORMAL);


        conta1.imprimirDemonstrativo();

        conta1.depositar(100);

        conta1.imprimirDemonstrativo();

        conta1.sacar(27.5);

        conta1.imprimirDemonstrativo();

        conta1.creditarRendimentos(6);
        conta1.imprimirDemonstrativo();

    }
}