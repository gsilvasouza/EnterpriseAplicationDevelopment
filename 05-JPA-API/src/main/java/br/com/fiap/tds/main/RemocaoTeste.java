package br.com.fiap.tds.main;

import br.com.fiap.tds.entity.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemocaoTeste {
    public static void main(String[] args) {
        //Obter  a fabrica e o entity manager
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = fabrica.createEntityManager();
        //Pesquisar o aluno
        Aluno aluno = em.find(Aluno.class, 1);
        //Remover
        em.remove(aluno);
        //Commit
        em.getTransaction().begin();
        em.getTransaction().commit();

        System.out.println("Aluno Removido com sucesso");
        //Fechar
        em.close();
        fabrica.close();
    }
}