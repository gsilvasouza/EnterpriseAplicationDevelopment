package br.com.fiap.revisao.bean;

import br.com.fiap.revisao.exception.SaldoInsuficienteException;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercicio6 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(
                1, 12, Calendar.getInstance(),
                100, TipoConta.COMUM);

        ContaPoupanca cp = new ContaPoupanca(
                1, 123,
                new GregorianCalendar(2021, Calendar.MARCH, 30),
                1000, 1);

        try{
            cc.retirar(200);
            System.out.println("Saque efetuado");
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }

    }
}
