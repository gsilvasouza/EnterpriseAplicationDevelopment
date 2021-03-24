package br.com.fiap.revisao.exception;

public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(String msg){
        super(msg);
    }

    public SaldoInsuficienteException(double saldo){
        super("Saldo insuficiente, limite maximo: " + saldo);
    }

    public SaldoInsuficienteException(){
        super("Saldo Insuficiente");
    }

}
