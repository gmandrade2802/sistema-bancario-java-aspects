package com.andrade.gabriel;

import java.time.LocalDate;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(String tipoCliente, LocalDate dataAbertura, double saldoInicial) {
        super("Investimento", tipoCliente, dataAbertura, saldoInicial);
    }

    @Override
    public double calculaValorTarifaManutencao() {
        return 50.00;
    }
}
