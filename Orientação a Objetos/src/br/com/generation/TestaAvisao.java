package br.com.generation;

public class TestaAvisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aviao avi1 = new Aviao();
		avi1.setModelo("IX35");
		avi1.setMarca("GOL");
		avi1.setCor("Branco");
		avi1.setNumeroPassageiros(240);
		avi1.setVelocidade(200);
		
		System.out.println("Modelo do avisao " + avi1.getModelo());
		System.out.println("Marca " + avi1.getMarca());
		System.out.println("Velocidade do aviao " +avi1.getVelocidade());
		System.out.println("Quantidade de passageiros " + avi1.getNumeroPassageiros());
		
		

		if (avi1.getNumeroPassageiros() < 100) {
			avi1.acelerar(100);
			System.out.println("Velocidade aumentada para " + avi1.getVelocidade());
		} else if (avi1.getNumeroPassageiros() >= 200) {
			avi1.reduzir(120);
			System.out.println("Velocidade reduzida para " + avi1.getVelocidade());
		}
	}
}
