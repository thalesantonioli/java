package smartcities.dao;

import javax.persistence.EntityManager;

import java.lang.reflect.*;
import java.util.List;

// Tabela e Chave
public class GeneticDAO<T, K> {

	protected EntityManager entityManager;

	private Class<T> clazz;

	public GeneticDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
		clazz = (Class<T>) ((ParameterizedType) getClass()
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

		if (entidade == null) {
			throw new Exception("Entidade não encontrada!");
		}
		
		entityManager.remove(entidade);
	}
	
	public List<T> listar(){
		return entityManager.createQuery("from " + clazz.getName()).getResultList();
	}
	
	public void commit() throws Exception {
		try {
			entityManager.getTransaction().begin();
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			if(entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
				throw new Exception("Erro no commit");
			}
		}
	}
}
