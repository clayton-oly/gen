package br.com.generation;

public class Aviao {

	// Atributos
	private String modelo;
	private String marca;
	private int numeroPassageiros;
	private String cor;
	private int velocidade;

	// Metodos Getters e Setters
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

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
	//Outros metodos
	public void acelerar(int aumentar) {
		velocidade = velocidade + aumentar;
	}
	public void reduzir(int reduzir) {
		velocidade = velocidade - reduzir;
	}

}
