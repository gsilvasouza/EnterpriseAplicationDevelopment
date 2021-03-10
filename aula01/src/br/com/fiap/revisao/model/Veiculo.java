package br.com.fiap.revisao.model;

public class Veiculo {
    //Modificadores
    //private -> Visto só para a propria classe
    //protected -> Visivel para a propria classe, filhas e mesmo pacote.
    //public -> Visivel para todos.
    //default -> Visivel para a mesma classe e mesmo pacote

    private String marca;
    private Integer ano;
    private boolean alienado;

    public Veiculo(String marca, Integer ano, boolean alienado) {
        this.marca = marca;
        this.ano = ano;
        this.alienado = alienado;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public boolean isAlienado() {
        return alienado;
    }

    public void setAlienado(boolean alienado) {
        this.alienado = alienado;
    }

}
