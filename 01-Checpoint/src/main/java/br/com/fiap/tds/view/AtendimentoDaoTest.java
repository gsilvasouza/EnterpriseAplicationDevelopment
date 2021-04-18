package br.com.fiap.tds.view;

import br.com.fiap.tds.dao.AtendimentoDao;
import br.com.fiap.tds.dao.impl.AtendimentoDaoImpl;
import br.com.fiap.tds.entity.Atendimento;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EntityNotFoundException;
import br.com.fiap.tds.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.util.Calendar;

public class AtendimentoDaoTest {
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

        AtendimentoDao dao = new AtendimentoDaoImpl(em);
        // public Atendimento(Calendar data, Integer duracao, Integer assunto)
        Atendimento atendimento = new Atendimento(Calendar.getInstance(), 20, "Financeiro");
        try{
            dao.insert(atendimento);
            dao.commit();
            System.out.println("Atendimento inserido com sucesso");
        }catch(CommitException e){
            System.out.println(e.getMessage());
        }

        try{
            atendimento = dao.findById(1);
            System.out.println(atendimento);
        }catch(EntityNotFoundException e){
            System.out.println(e.getMessage());
        }

        em.close();
        EntityManagerFactorySingleton.getInstance().close();
    }
}
