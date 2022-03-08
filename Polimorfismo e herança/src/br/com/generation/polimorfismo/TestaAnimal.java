package br.com.generation.polimorfismo;

public class TestaAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro ca = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguica pre = new Preguica();
		// Animal ani = new Animal();

		ca.emitirSom();
		cav.emitirSom();
		pre.emitirSom();
	}

}
