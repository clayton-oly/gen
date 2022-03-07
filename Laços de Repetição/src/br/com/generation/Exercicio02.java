package br.com.generation;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int par = 0, impar = 0;
		
		for(int i = 0; i <= 9; i++) {
			System.out.println("Digite um numero");
			int num = entrada.nextInt();
			
			if(num % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("Tem " + impar + " numeros impar");
		System.out.println("Tem " + par + " numeros pares");
		entrada.close();
	}
}
