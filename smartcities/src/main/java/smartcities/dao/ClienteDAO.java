package smartcities.dao;

import javax.persistence.EntityManager;

import smartcities.entity.Cliente;

public class ClienteDAO extends GeneticDAO<Cliente, Integer>{

	public ClienteDAO(EntityManager entityManager) {
		super(entityManager);
	}

}
