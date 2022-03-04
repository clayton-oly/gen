package br.com.generation;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entradaVetor = new Scanner(System.in);

		int[] arrayVetor = {4,6,2,5,6,3,5,1,4,2};
		int media = 0, soma = 0, p = 0;
		
		for (int i = 0; i <= 9; i++) {
			System.out.println("Os lancamentos do dado foram: " + arrayVetor[i]);
			soma = soma + arrayVetor[i];
			media = soma / 10;
			
			if (arrayVetor[i] == 6) {
				p++;
			}
		}
		entradaVetor.close();

		System.out.println("A media é: " + media);
		System.out.println("A quantidade de numero de maior pontuacao é: " + p);
	}
}