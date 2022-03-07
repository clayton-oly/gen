package br.com.generation;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int i = 0, numero, soma = 0, media = 0;

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			if (numero > 0) {
				if (numero % 3 == 0) {
					soma = soma + numero;
					i++;
				}
			}
		} while (numero != 0);
		media = soma / i;
		System.out.println("A media de todos os números é: " + media);
		leia.close();
	}
}
