package br.com.fiap.tds.dao.impl;

import br.com.fiap.tds.dao.AtendimentoDao;
import br.com.fiap.tds.entity.Atendimento;

import javax.persistence.EntityManager;

public class AtendimentoDaoImpl extends GenericDaoImpl<Atendimento, Integer> implements AtendimentoDao {
    public AtendimentoDaoImpl(EntityManager em) {
        super(em);
    }
}
