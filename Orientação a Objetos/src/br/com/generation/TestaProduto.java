package br.com.generation;

import java.util.Scanner;

public class TestaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method

		Produto pro1 = new Produto();
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o modelo do produto");
		String modelo = scan.next();

		System.out.println("Digite o marca do produto");
		String marca = scan.next();

		System.out.println("Digite o valor do produto");
		double valor = scan.nextDouble();

		pro1.cadastrar();

		System.out.println("Se deseja exibir o produto digite 1, ou 2 para limpar tela");
		int numero = scan.nextInt();

		if (numero == 1) {
			pro1.setMarca(marca);
			pro1.setModelo(modelo);
			pro1.setValor(valor);
			
			pro1.exibir();
		} else {

		}
		scan.close();
	}

}
