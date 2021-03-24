package br.com.fiap.tds.main;

import br.com.fiap.tds.entity.Aluno;
import br.com.fiap.tds.entity.Periodo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RefreshTeste {
    //Atualiza os dados do banco no objeto
    public static void main(String[] args) {
        //Obter a fabrica e o entity manager
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = fabrica.createEntityManager();
        //Pesquisa um aluno com o codigo 1
        Aluno aluno = em.find(Aluno.class, 1);
        //Exibir os dados
        System.out.println(aluno);
        //Alterar os valores nome e período no objeto
        aluno.setNome("Gabriel");
        aluno.setPeriodo(Periodo.NOTURNO);
        //Exibir os dados
        System.out.println(aluno);
        //Refresh
        em.refresh(aluno);
        //Exibir os dados
        System.out.println(aluno);
        //Fechar
        em.close();
        fabrica.close();
    }
}
