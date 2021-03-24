package br.com.fiap.tds.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Teste.java - compilação -> Teste.class(bytecode) -> "Execução interpretação JVM

///Definir até quando a anotação estará presente
@Retention(RetentionPolicy.RUNTIME)
//Source -> código fonte(.java)
//Class -> ate o bytecode(.class) (padrão)
//runtime -> até a execução.

//Define o lugar onde a anotação pode ser utilizada
//Field -> atributo
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Coluna {
    String nome();
    boolean unico() default true;
    boolean pk() default false;
    int tamanho() default 255;
}

