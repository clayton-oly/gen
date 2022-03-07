package br.com.generation;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a idade da pessoa entre 10 e 25");
		int idade = entrada.nextInt();
		
		switch (idade) {
			case 10, 11, 12, 13, 14:
				System.out.println("Infantil");
			break;
			
			case 15, 16, 17:
				System.out.println("Juvenil");
			break;
			
			case 18, 19, 20, 21, 22, 23, 24, 25:
				System.out.println("Adulto");
			break;
			
			default:
				System.out.println("Opacao Invalida!!");
			break;
		}
		entrada.close();
	}

}
