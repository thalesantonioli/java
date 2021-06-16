package smartcities.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import smartcities.entity.Cliente;
import smartcities.entity.ContratoAluguel;
import smartcities.entity.Estabelecimento;
import smartcities.entity.TipoEstabelecimento;

public class Cadastro {

	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("smartcities").createEntityManager();
		
		TipoEstabelecimento tipoEstabelecimento = new TipoEstabelecimento(0, "PetShop", null);

		Cliente cliente = new Cliente(0, "Thales", null);
		Cliente cliente2 = new Cliente(0, "Leandro", null);
		
		ContratoAluguel contratoAluguel = new ContratoAluguel(1, 2000, 
				new GregorianCalendar(2000, Calendar.JANUARY, 1), null);
		
		
		List<Cliente> lista = new ArrayList<Cliente>();
		lista.add(cliente);
		lista.add(cliente2);
		
		Estabelecimento estabelecimento = new Estabelecimento(0,"Fiap Pet", null, tipoEstabelecimento, lista);
		Estabelecimento estabelecimento2 = new Estabelecimento(0, "Poyotos dog", contratoAluguel, tipoEstabelecimento, lista);
		
		contratoAluguel.setEstabelecimento(estabelecimento2);
		
		entityManager.persist(estabelecimento);
		entityManager.persist(estabelecimento2);
		
		entityManager.getTransaction().begin();
		entityManager.getTransaction().commit();

		entityManager.close();
	}
}
