package br.com.fiap.revisao.bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Exercicio7 {
    public static void main(String[] args) {
        List<ContaCorrente> lista = new ArrayList<>();
        lista.add(new ContaCorrente(1, 12, Calendar.getInstance(), 100, TipoConta.COMUM));
        lista.add(new ContaCorrente(1, 12, Calendar.getInstance(), 100, TipoConta.ESPECIAL));
        lista.add(new ContaCorrente(1, 12, Calendar.getInstance(), 100, TipoConta.PREMIUM));

        lista.forEach(churros -> System.out.println(churros.getSaldo()));
    }
}
