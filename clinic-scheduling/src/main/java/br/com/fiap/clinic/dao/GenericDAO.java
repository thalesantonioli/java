package br.com.fiap.clinic.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;

public abstract class GenericDAO<T, K> {

	protected EntityManager entityManager;
	private Class<T> clazz;

	public GenericDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
		this.clazz = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public void cadastrar(T entidade) {
		entityManager.persist(entidade);
	}

	public void atualizar(T entidade) {
		entityManager.merge(entidade);
	}

	public T buscar(K chave) {
		return entityManager.find(clazz, chave);
	}

	public void remover(K chave) throws Exception {
		T entidade = buscar(chave);
		if(entidade == null) {
			throw new Exception("Entidade não encontrada");
		}
		entityManager.remove(entidade);
	}

	public void commit() {
		try {
			entityManager.getTransaction().begin();
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
		}
	}
	
	public List<T> listar(){
		return entityManager.createQuery("from " + clazz.getName(), clazz).getResultList();
	}

}
