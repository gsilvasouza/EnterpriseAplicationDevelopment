package br.com.fiap.revisao.bean;

import br.com.fiap.revisao.exception.SaldoInsuficienteException;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento{
    private float taxa;
    //Constante
    //final: variavel -> não pdode ser alterada;
    //          método -> não permite sobrescrita;
    //          classe -> não permite herança;
    //static -> o elemento pertence a classe e não mais ao objeto.
    private static final float RENDIMENTO = 0.04F;

    public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, float taxa) {
        super(agencia, numero, dataAbertura, saldo);
        this.taxa = taxa;
    }

    @Override
    public double retirar(double valor) throws SaldoInsuficienteException {
       if(saldo < valor){
            throw new SaldoInsuficienteException(saldo);
       }
        return saldo -= valor + taxa;
    }

    @Override
    public Double calculaRetornoInvestimento() {
        return saldo * RENDIMENTO;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public static float getRENDIMENTO() {
        return RENDIMENTO;
    }
}
