package br.com.fiap.abstrato;

public class Circulo extends Forma {

	//Estático, pois não existe a necessidade de cada objeto ter a sua própria constante e final, para que o valor da constante nunca se altere
	public static final double NUMERO_PI = 3.1416;
	
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return NUMERO_PI * Math.pow(raio, 2);
	}
}
