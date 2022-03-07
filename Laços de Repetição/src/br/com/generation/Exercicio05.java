package br.com.generation;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

	    int numero, soma= 0;

	    do {
	        System.out.println("Digite um número: ");
	        numero = leia.nextInt();
	        soma = soma + numero;
	    } 
	    while (numero != 0);
	        System.out.println("A soma de todos os números é: " + soma);
	        leia.close();
	}
}
