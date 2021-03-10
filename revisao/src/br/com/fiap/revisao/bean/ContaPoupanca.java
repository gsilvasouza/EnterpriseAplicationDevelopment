package br.com.fiap.revisao.bean;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento{
    private TipoConta tipoConta;
    private final float RENDIMENTO;

    public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipoConta, float RENDIMENTO) {
        super(agencia, numero, dataAbertura, saldo);
        this.tipoConta = tipoConta;
        this.RENDIMENTO = RENDIMENTO;
    }

    public void retirar(double valor) throws Exception {
        if(negativacaoSaldo(valor, super.getSaldo())){
            throw new Exception("Saldo insuficiente");
        }

        super.retirar(valor, 2.00);
    }

    public void depositar(double valor){
        super.depositar(valor);
    }

    @Override
    public Double calculaRetornoInvestimento() {
        return super.getSaldo() * this.RENDIMENTO;
    }

    private boolean negativacaoSaldo(double valorSaque, double saldoConta){
        double saldo = valorSaque - saldoConta;
        return saldo <= 0;
    }
}
