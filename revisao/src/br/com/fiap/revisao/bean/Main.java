package br.com.fiap.revisao.bean;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        try {
            Calendar calendar = Calendar.getInstance();
            //public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipoConta)
            ContaCorrente conta01 = new ContaCorrente(01, 0001, calendar, 1000.00, TipoConta.COMUM);
            System.out.println(conta01.getSaldo());
            conta01.depositar(200.00);
            System.out.println(conta01.getSaldo());
            conta01.retirar(500.00);
            System.out.println(conta01.getSaldo());
            conta01.retirar(1000.00);
            System.out.println(conta01.getSaldo());
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
