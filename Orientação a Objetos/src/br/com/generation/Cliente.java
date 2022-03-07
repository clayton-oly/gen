package br.com.generation;

public class Cliente {

	String nome;
	int cpf;
	char sexo;
	int idade;
	double saldo;
	double saldoRestante;
	double valorProduto;

	public void pagamento(double valor) {
		saldoRestante =  saldo - valor;
	}

	public void recebe () {
		System.out.println("Compra realizada: Americanas - Valor de R$" + valorProduto);
	}

}
