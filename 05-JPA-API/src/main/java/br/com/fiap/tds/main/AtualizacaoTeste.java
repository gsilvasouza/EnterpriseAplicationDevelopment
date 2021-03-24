package br.com.fiap.tds.main;

import br.com.fiap.tds.entity.Aluno;
import br.com.fiap.tds.entity.Periodo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;
import java.util.GregorianCalendar;

//View <-> Controller <-> DAO <-> Banco
//Pagina <-> Sistema <-> Banco

public class AtualizacaoTeste {
    public static void main(String[] args) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = fabrica.createEntityManager();

        //Instanciar um aluno com codigo que existe no banco(Estado:detached)
        Aluno aluno = new Aluno(1, "Luiz", "2TDSJ",
                new GregorianCalendar(2001, Calendar.MARCH, 10), Periodo.MATUTINO, false);
        //Possui um retorno e assim o objeto gerenciado vai ser o alunoGerenciado
        //merge cria se o objeto não existir
        Aluno alunoGerenciado = em.merge(aluno);
        em.getTransaction().begin();
        em.getTransaction().commit();
        //Fechar
        em.close();
        fabrica.close();

    }
}
