package br.com.fiap.tds.view;

import br.com.fiap.tds.dao.SinalDao;
import br.com.fiap.tds.dao.impl.SinalDaoImpl;
import br.com.fiap.tds.entity.Sinal;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EntityNotFoundException;
import br.com.fiap.tds.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class SinalDaoTest {
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        SinalDao dao = new SinalDaoImpl(em);
        Sinal sinal = new Sinal("Ola", 10);
        try{
            dao.insert(sinal);
            dao.commit();
            System.out.println("Sinal inserido com sucesso");
        }catch(CommitException e){
            System.out.println(e.getMessage());
        }

        try{
            sinal = dao.findById(1);
            System.out.println(sinal);
        }catch(EntityNotFoundException e){
            System.out.println(e.getMessage());
        }

        em.close();
        EntityManagerFactorySingleton.getInstance().close();
    }
}
