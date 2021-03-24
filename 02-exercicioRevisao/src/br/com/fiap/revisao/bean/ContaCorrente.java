package br.com.fiap.revisao.bean;

import br.com.fiap.revisao.exception.SaldoInsuficienteException;

import java.util.Calendar;

public class ContaCorrente extends Conta {
    private TipoConta tipoConta;

    public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipoConta) {
        super(agencia, numero, dataAbertura, saldo);
        this.tipoConta = tipoConta;
    }

    @Override
    public double retirar(double valor) throws SaldoInsuficienteException {
        if (tipoConta == TipoConta.COMUM && saldo < valor) {
            throw new SaldoInsuficienteException(saldo);
        }
        saldo -= valor;
        return saldo;
    }

}
