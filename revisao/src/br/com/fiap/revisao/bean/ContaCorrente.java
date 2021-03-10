package br.com.fiap.revisao.bean;

import java.util.Calendar;

public class ContaCorrente extends Conta {
    private TipoConta tipoConta;

    public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipoConta) {
        super(agencia, numero, dataAbertura, saldo);
        this.tipoConta = tipoConta;
    }

    public void depositar(double valor){
        super.depositar(valor);
    }


    public void retirar(double valor) throws Exception {
        if (tipoConta.equals(TipoConta.COMUM)) {
            if (negativacaoSaldo(valor, super.getSaldo())) {
                throw new Exception("Operação não pode ser feita valor do saque maior que o saldo da conta");
            }
            super.retirar(valor);
        } else {
            super.retirar(valor);
        }
    }
    private boolean negativacaoSaldo(double valorSaque, double saldoConta){
        double saldo = valorSaque - saldoConta;
        return !(saldo <= 0);
    }
}
