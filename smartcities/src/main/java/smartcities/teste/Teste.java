package smartcities.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import smartcities.entity.Cliente;
import smartcities.entity.ClientePf;

public class Teste {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities"); // Gerenciador

		EntityManager entityManager = fabrica.createEntityManager();

		ClientePf clientePf = new ClientePf();
		clientePf.setNome("Thaisa");
		clientePf.setEstadoCivil("Solteiro");
		clientePf.setEscolaridade("Superior");

		try {
			entityManager.getTransaction().begin();

			entityManager.persist(clientePf);

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
