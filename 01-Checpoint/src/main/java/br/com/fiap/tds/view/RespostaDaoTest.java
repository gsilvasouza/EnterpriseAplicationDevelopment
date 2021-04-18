package br.com.fiap.tds.view;

import br.com.fiap.tds.dao.RespostaDao;
import br.com.fiap.tds.dao.impl.RespostaDaoImpl;
import br.com.fiap.tds.entity.Resposta;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EntityNotFoundException;
import br.com.fiap.tds.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class RespostaDaoTest {
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        RespostaDao dao = new RespostaDaoImpl(em);
        Resposta resposta = new Resposta("Ola", 10);
        try{
            dao.insert(resposta);
            dao.commit();
            System.out.println("Resposta inserida com sucesso");
        }catch(CommitException e){
            System.out.println(e.getMessage());
        }

        try{
            resposta = dao.findById(1);
            System.out.println(resposta);
        }catch(EntityNotFoundException e){
            System.out.println(e.getMessage());
        }

        em.close();
        EntityManagerFactorySingleton.getInstance().close();
    }
}
