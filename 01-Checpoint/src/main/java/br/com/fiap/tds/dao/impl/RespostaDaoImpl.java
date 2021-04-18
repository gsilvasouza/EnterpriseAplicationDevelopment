package br.com.fiap.tds.dao.impl;

import br.com.fiap.tds.dao.RespostaDao;
import br.com.fiap.tds.entity.Resposta;

import javax.persistence.EntityManager;

public class RespostaDaoImpl extends GenericDaoImpl<Resposta, Integer> implements RespostaDao {
    public RespostaDaoImpl(EntityManager em) {
        super(em);
    }
}
