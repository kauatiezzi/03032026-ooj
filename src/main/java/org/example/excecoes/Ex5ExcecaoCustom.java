package org.example.excecoes;

public class Ex5ExcecaoCustom {
    static void sacar(double saldo, double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente! Saldo: " + saldo);
        }
        System.out.println("Saque realizado: " + valor);
    }

    public static void main(String[] args) {
        try {
            sacar(100, 150);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
