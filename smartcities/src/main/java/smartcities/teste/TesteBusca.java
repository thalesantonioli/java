package smartcities.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import smartcities.entity.Cliente;

public class TesteBusca {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities"); // Gerenciador

		EntityManager entityManager = fabrica.createEntityManager();

		Cliente cliente = entityManager.find(Cliente.class, 1);
		
		System.out.println(cliente.getId() + " " + cliente.getNome());

		entityManager.close();
		fabrica.close();
	}

}
