package br.com.fiap.tds.main;

import br.com.fiap.tds.model.Aluno;
import br.com.fiap.tds.model.Produto;
import br.com.fiap.tds.orm.Orm;

public class Exercicio {
    public static void main(String[] args) {
        //Instaciar produto e aluno
        Produto produto = new Produto();
        Aluno aluno = new Aluno();
        //Instanciar ORM
        Orm orm = new Orm();
        //Chamar o metodo gerarPesquisa
        System.out.println(orm.gerarPesquisa(produto));
        System.out.println(orm.gerarPesquisa(aluno));
    }
}
