package br.com.fiap.tds.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        //Gerenciador de entidades e colocamos o nome da nossa unidade de persistência
        EntityManagerFactory fabrica =
                Persistence.createEntityManagerFactory("oracle");
        //Gerenciador de entidade
        EntityManager em = fabrica.createEntityManager();

        //Fechar
        em.close();
        fabrica.close();
    }
}
