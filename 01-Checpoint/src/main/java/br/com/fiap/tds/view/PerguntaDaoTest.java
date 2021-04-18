package br.com.fiap.tds.view;

import br.com.fiap.tds.dao.PerguntaDao;
import br.com.fiap.tds.dao.impl.PerguntaDaoImpl;
import br.com.fiap.tds.entity.Pergunta;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EntityNotFoundException;
import br.com.fiap.tds.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class PerguntaDaoTest {
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        PerguntaDao dao = new PerguntaDaoImpl(em);
        //Pergunta(String texto, Integer duracao)
        Pergunta pergunta = new Pergunta("Ola", 10);

        try{
            dao.insert(pergunta);
            dao.commit();
            System.out.println("Pergunta inserida com sucesso");
        }catch(CommitException e){
            System.out.println(e.getMessage());
        }

        try{
            pergunta = dao.findById(1);
            System.out.println(pergunta);
        }catch(EntityNotFoundException e){
            System.out.println(e.getMessage());
        }

        em.close();
        EntityManagerFactorySingleton.getInstance().close();
    }
}
