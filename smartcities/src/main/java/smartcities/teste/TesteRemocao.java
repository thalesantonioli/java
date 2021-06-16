package smartcities.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import smartcities.entity.Cliente;

public class TesteRemocao {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities"); // Gerenciador

		EntityManager entityManager = fabrica.createEntityManager();

		Cliente cliente = entityManager.find(Cliente.class, 1);
		
		try {
			entityManager.getTransaction().begin();

			entityManager.remove(cliente);

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			if(entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
		}

		entityManager.close();
		fabrica.close();
	}
}
