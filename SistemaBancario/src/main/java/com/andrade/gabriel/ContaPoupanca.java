package com.andrade.gabriel;

import java.time.LocalDate;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String tipoCliente, LocalDate dataAbertura, double saldoInicial) {
        super("Poupança", tipoCliente, dataAbertura, saldoInicial);
    }

    @Override
    public double calculaValorTarifaManutencao() {
        return 10.00;
    }
}

