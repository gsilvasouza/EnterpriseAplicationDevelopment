package br.com.fiap.tds.main;

import br.com.fiap.tds.annotation.Coluna;
import br.com.fiap.tds.model.Produto;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Teste {
    public static void main(String[] args) {
        //Instaciar um produto
        Produto produto = new Produto();

        //API Reflection -> obtem a estrutura da classe
        //Obter o nome da classe
        String nome = produto.getClass().getSimpleName();
        System.out.println(nome);

        //Obtem os métodos declarados na classe
        Method[] metodos = produto.getClass().getDeclaredMethods();
        for(Method m : metodos){
            System.out.println(m.getName());
        }

        //Obtem os atributos declarados na classe
        Field[] atributos = produto.getClass().getDeclaredFields();
        for(Field f : atributos){
            System.out.println(f.getName() + " " + f.getType());
            //Recuperar a anotação @Coluna
            Coluna anotacao = f.getAnnotation(Coluna.class);
            System.out.println(anotacao.nome() + " PK: " + anotacao.pk() +
                    " Único: " + anotacao.unico() + " Tamanho: " + anotacao.tamanho());
        }

        Annotation[] anotacoes = produto.getClass().getAnnotations();
        for(Annotation annotation : anotacoes){
            System.out.println(annotation.toString());
        }
    }
}
