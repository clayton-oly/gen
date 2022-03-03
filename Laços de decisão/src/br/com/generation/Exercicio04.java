package br.com.generation;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um numero");
		int num = entrada.nextInt();
		
		if (num % 2 != 0) {
			System.out.println("Numero e impar " + num + " elevado ao quadrado e " + Math.pow(num, 2));
		}
		else {
			System.out.println("Numero e par " + num + " raiz quadrada e " + Math.sqrt(num));
		}

	}

}
