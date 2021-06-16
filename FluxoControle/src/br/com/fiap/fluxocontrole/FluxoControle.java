package br.com.fiap.fluxocontrole;

public class FluxoControle {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 15;
		
		System.out.println(x == 10 ^ y == 3); // XOR
		System.out.println(x == 10 && y == 3); // AND
		System.out.println(x == 10 || y == 3); // OR
		System.out.println(!(y == 3)); // NOT
				
				
		int idade = 10;
		
		if(idade >= 18 && idade < 70) {
			System.out.println("Maior idade");
		} else if(idade >= 70){
			System.out.println("Terceira idade");
		} else {
			System.out.println("Menor idade");
		}

	}

}
