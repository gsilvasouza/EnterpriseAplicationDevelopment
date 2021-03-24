package br.com.fiap.tds.main;

import br.com.fiap.tds.entity.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PesquisaTeste {
    public static void main(String[] args) {
        //Obter uam fabrica e um entity manager
        EntityManagerFactory fabrica =
                Persistence.createEntityManagerFactory("oracle");
        EntityManager em = fabrica.createEntityManager();

        //Pesquisar um aluno pela PK(codigo)
        Aluno aluno = em.find(Aluno.class,2 );

        //Exibir os dados do aluno
        System.out.println(aluno);

        //Fechar conexões
        em.close();
        fabrica.close();
    }
}
