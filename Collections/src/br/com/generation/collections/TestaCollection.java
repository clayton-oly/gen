package br.com.generation.collections;

import java.util.Scanner;

public class TestaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Produto pro = new Produto();

		char opcoes;

		do {
			
			System.out.println(
					"Digite 1 para adicionar, 2 para atualizar, 3 para remover, 4 para listar ou 0 para encerrar o programa");
			opcoes = scan.next().charAt((0));;
			System.out.println();

			switch (opcoes) {
			case '0':
				System.out.println("Saindo do sistema");
				break;
			case '1':
				pro.adicionar();
				System.out.println();
				break;
			case '2':
				pro.atualizar();
				System.out.println();
				break;
			case '3':
				pro.remover();
				System.out.println();
				break;
			case '4':
				pro.listar();
				System.out.println();
				break;
			default:
				System.out.println("Opcoes invalidas");
				System.out.println();
			}
		} while (opcoes != '0');
		{

		}

		scan.close();

	}

}
