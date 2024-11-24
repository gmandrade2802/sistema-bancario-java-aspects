package com.andrade.gabriel;

import java.time.LocalDate;

public class Banco {
    public static void main(String[] args) {
        // Criando instâncias das contas
        Conta contaCorrente = new ContaCorrente("Físico", LocalDate.of(2020, 1, 15), 1000.00);
        Conta contaSalario = new ContaSalario("Físico", LocalDate.of(2022, 5, 20), 500.00);
        Conta contaPoupanca = new ContaPoupanca("Físico", LocalDate.of(2021, 3, 10), 1500.00);
        Conta contaInvestimento = new ContaInvestimento("Jurídico", LocalDate.of(2020, 8, 30), 3000.00);

        // Realizando depósitos e saques
        contaCorrente.depositar(500.00);
        contaSalario.sacar(600.00);  // Exemplo de saque com saldo insuficiente
        contaPoupanca.sacar(2000.00);  // Exemplo de saque com saldo insuficiente
        contaInvestimento.depositar(1000.00);

        // Tentando realizar saques após o depósito
        contaCorrente.sacar(1200.00);  // Deve funcionar
        contaInvestimento.sacar(4000.00);  // Exemplo de saque com saldo insuficiente
    }
}
