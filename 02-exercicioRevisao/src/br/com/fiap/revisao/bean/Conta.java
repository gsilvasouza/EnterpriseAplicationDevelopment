package br.com.fiap.revisao.bean;

import br.com.fiap.revisao.exception.SaldoInsuficienteException;

import java.util.Calendar;

public abstract class Conta {
    private int agencia;
    private int numero;
    private Calendar dataAbertura;
    protected double saldo;

    public Conta(){}

    public Conta(int agencia, int numero, Calendar dataAbertura, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    public double depositar(double valor){
        return saldo += valor;
    }

    //Metodos abstract -> sem implementação
    //a classe filha(não abstrata) deve implementala
    public abstract double retirar(double valor) throws SaldoInsuficienteException;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
