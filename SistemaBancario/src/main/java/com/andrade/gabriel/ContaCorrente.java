package com.andrade.gabriel;

import java.time.LocalDate;

public class ContaCorrente extends Conta {

    public ContaCorrente(String tipoCliente, LocalDate dataAbertura, double saldoInicial) {
        super("Corrente", tipoCliente, dataAbertura, saldoInicial);
    }

    @Override
    public double calculaValorTarifaManutencao() {
        return 20.00;
    }
}

