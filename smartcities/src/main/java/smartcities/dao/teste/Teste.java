package smartcities.dao.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import smartcities.dao.ClienteDAO;
import smartcities.entity.Cliente;

public class Teste {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("smartcities").createEntityManager();

		ClienteDAO clienteDAO = new ClienteDAO(entityManager);

		Cliente cliente = new Cliente(0, "TesteDAO");

		clienteDAO.cadastrar(cliente);

		List<Cliente> lista = clienteDAO.listar();

		lista.forEach(d -> System.out.println(d.getNome()));

		try {
			clienteDAO.remover(4);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			clienteDAO.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
