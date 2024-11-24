package com.andrade.gabriel;

import java.time.LocalDate;

public class ContaSalario extends Conta {

    public ContaSalario(String tipoCliente, LocalDate dataAbertura, double saldoInicial) {
        super("Salário", tipoCliente, dataAbertura, saldoInicial);
    }

    @Override
    public double calculaValorTarifaManutencao() {
        return 5.00;
    }
}

