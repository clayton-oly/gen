package br.com.generation;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int numero1 = entrada.nextInt();
		
		System.out.println("Digite um valor");
		int numero2 = entrada.nextInt();
		
		System.out.println("Digite um valor");
		int numero3 = entrada.nextInt();
		
		if (numero1 >= numero2 && numero1 >= numero3 ) {
			System.out.println(numero1   + " e o maior");
			
		}
		else if (numero2 >= numero3) {
			System.out.println(numero2   + " e o maior");
		}
		else {
			System.out.println(numero3   + " e o maior");
		}
		
		entrada.close();
	}

}
