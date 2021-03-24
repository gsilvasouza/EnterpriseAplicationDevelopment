package br.com.fiap.tds.main;

import br.com.fiap.tds.entity.Aluno;
import br.com.fiap.tds.entity.Periodo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CadastroTeste {
    public static void main(String[] args) {
        //Obter uma fabrica e um entity manager
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = fabrica.createEntityManager();

        //Instanciar um novo aluno sem o código(Estado: new - não gerenciado)
        Aluno aluno = new Aluno("Gabriel", "2TDSJ",
                new GregorianCalendar(200, Calendar.JULY, 10), Periodo.MATUTINO, true);
        //Adiciona o aluno no contexto do Entity Manager(gerencia-lo)
        em.persist(aluno);
        //Começar com uma transação
        em.getTransaction().begin();
        //Realizar o commit
        em.getTransaction().commit();

        System.out.println("Aluno Registrado");
        //Atualiza o valor no banco, faz um update automatico.
        aluno.setNome("Luiz");

        ///Fechar
        em.close();
        fabrica.close();
    }
}
