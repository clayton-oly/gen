package br.com.generation;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade = 0, menor = 0, maior = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		while (idade != -99) {
			System.out.println("Digite sua idade");
			idade = entrada.nextInt();
			if(idade < 21) {
				menor++;
			}
			else if (idade > 50) {
				maior++;
			}
		}
		System.out.println("Quantidade de pessoas com idade menor que 21 " + menor);
		System.out.println("Quantidade de pessoas com idade maior que 50 " + maior);
		entrada.close();
	}
}
