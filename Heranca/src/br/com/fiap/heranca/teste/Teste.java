package br.com.fiap.heranca.teste;

import br.com.fiap.heranca.Animal;
import br.com.fiap.heranca.Cachorro;

public class Teste {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.setAlimenta("Todo animal se alimenta");
		animal.setLocomove("Todo animal se locomove");

		Cachorro cachorro = new Cachorro();
		cachorro.setAlimenta("Cachorro come ração de cachorro");
		cachorro.setLocomove("Cachorro usa 4 patas");
		cachorro.setLatido("Cachorro faz Au Au");

		Animal poodle = new Cachorro();
		poodle.setAlimenta("Cachorro come ração de cachorro");
		poodle.setLocomove("Cachorro usa 4 patas");

	}

}
