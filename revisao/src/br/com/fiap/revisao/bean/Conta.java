package br.com.fiap.revisao.bean;

import java.util.Calendar;

public abstract class Conta {
    private int agencia;
    private int numero;
    private Calendar dataAbertura;
    private double saldo;

    public Conta(int agencia, int numero, Calendar dataAbertura, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void retirar(double valor) throws Exception {
        this.saldo -= valor;
    }

    public void retirar(double valor, double taxaRetirada) throws Exception {
        this.saldo -= valor - taxaRetirada;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
