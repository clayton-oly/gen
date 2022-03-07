package br.com.generation;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaVetor = new Scanner(System.in);

		int[][] n1 = { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 } };

		int[][] n2 = { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 } };

		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];

		System.out.println("MATRIZ SOMA ");
		for (int i = 0; i <= 3; i++) {
			for (int a = 0; a <= 3; a++) {
				m1[i][a] = n1[i][a] + n2[i][a];
				System.out.print(m1[i][a] + "|");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("MATRIZ SUBTRACAO ");
		for (int i = 0; i <= 3; i++) {
			for (int a = 0; a <= 3; a++) {
				m2[i][a] = n1[i][a] - n2[i][a];
				System.out.print(m2[i][a] + "|");
			}
			System.out.println();
		}

	}

}
