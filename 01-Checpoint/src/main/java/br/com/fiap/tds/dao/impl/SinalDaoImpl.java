package br.com.fiap.tds.dao.impl;

import br.com.fiap.tds.dao.SinalDao;
import br.com.fiap.tds.entity.Sinal;

import javax.persistence.EntityManager;

public class SinalDaoImpl extends GenericDaoImpl<Sinal, Integer> implements SinalDao {
    public SinalDaoImpl(EntityManager em) {
        super(em);
    }
}
