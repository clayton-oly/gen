package br.com.generation;

public class Produto {

	// Atributos
	private String modelo;
	private String marca;
	private double valor;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void cadastrar () {
		System.out.println("Produto cadastrado com sucesso");
	}
	
	public void exibir () {
		System.out.println(marca);
		System.out.println(modelo);
		System.out.println(valor);
	}

}
