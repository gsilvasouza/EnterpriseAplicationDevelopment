package br.com.fiap.tds.dao.impl;

import br.com.fiap.tds.dao.PerguntaDao;
import br.com.fiap.tds.entity.Pergunta;

import javax.persistence.EntityManager;

public class PerguntaDaoImpl extends GenericDaoImpl<Pergunta, Integer> implements PerguntaDao {
    public PerguntaDaoImpl(EntityManager em) {
        super(em);
    }
}
