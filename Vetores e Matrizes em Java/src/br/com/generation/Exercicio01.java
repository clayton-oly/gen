package br.com.generation;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaVetor = new Scanner(System.in);

		int maior = 0;
		int[] arrayVetor = new int[5];

		for (int i = 0; i <= 4; i++) {

			System.out.println("Digite um valor: ");
			arrayVetor[i] = entradaVetor.nextInt();

			if (arrayVetor[i] > maior) {
				maior = arrayVetor[i];
			}
		}
		for (int c = 0; c <= 4; c++) {
			System.out.print(" " + arrayVetor[c]);
		}

		entradaVetor.close();

		System.out.println("\nO  maior  número é: " + maior);
	}
}