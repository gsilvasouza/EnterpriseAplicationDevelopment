package br.com.fiap.tds.dao.impl;

import br.com.fiap.tds.dao.FuncionarioDao;
import br.com.fiap.tds.dao.GenericDao;
import br.com.fiap.tds.entity.Funcionario;

import javax.persistence.EntityManager;

public class FuncionarioDaoImpl extends GenericDaoImpl<Funcionario, Integer> implements FuncionarioDao {
    public FuncionarioDaoImpl(EntityManager em) {
        super(em);
    }
}
