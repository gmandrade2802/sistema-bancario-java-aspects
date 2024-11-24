package com.andrade.gabriel;

import java.time.LocalDate;

public abstract class Conta {
    protected String tipoConta;
    protected String tipoCliente;
    protected LocalDate dataAbertura;
    protected double saldo;

    public Conta(String tipoConta, String tipoCliente, LocalDate dataAbertura, double saldoInicial) {
        this.tipoConta = tipoConta;
        this.tipoCliente = tipoCliente;
        this.dataAbertura = dataAbertura;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.err.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.err.println("Erro: Saldo insuficiente.");
        }
    }

    public abstract double calculaValorTarifaManutencao();
    
    // Método para verificar saldo
    public boolean verificarSaldo(double valor) {
        return saldo >= valor;
    }
}

