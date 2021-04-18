package br.com.fiap.tds.view;

import br.com.fiap.tds.dao.FuncionarioDao;
import br.com.fiap.tds.dao.impl.FuncionarioDaoImpl;
import br.com.fiap.tds.entity.Funcionario;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EntityNotFoundException;
import br.com.fiap.tds.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.util.Calendar;

public class FuncionarioDaoTest {
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        FuncionarioDao dao = new FuncionarioDaoImpl(em);
        //Funcionario(String nome, String email, String senha, Calendar dataCadastro, String telefone)
        Funcionario funcionario = new Funcionario("Gabriel", "gsilva@gmail.com", "1234",Calendar.getInstance(), "11345678");
        try{
            dao.insert(funcionario);
            dao.commit();
            System.out.println("Funcionario inserido com sucesso");
        }catch(CommitException e){
            System.out.println(e.getMessage());
        }

        try{
            funcionario = dao.findById(1);
            System.out.println(funcionario);
        }catch(EntityNotFoundException e){
            System.out.println(e.getMessage());
        }

        em.close();
        EntityManagerFactorySingleton.getInstance().close();
    }
}
