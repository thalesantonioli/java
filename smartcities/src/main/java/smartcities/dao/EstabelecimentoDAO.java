package smartcities.dao;

import javax.persistence.EntityManager;

import smartcities.entity.Estabelecimento;

public class EstabelecimentoDAO extends GeneticDAO<Estabelecimento, Integer>{

	public EstabelecimentoDAO(EntityManager entityManager) {
		super(entityManager);
	}

}
