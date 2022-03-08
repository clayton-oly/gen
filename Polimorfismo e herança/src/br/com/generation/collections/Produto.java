package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {

	// Criando e Instanciando a lista de produtos
	ArrayList<String> listaproduto = new ArrayList<>();

	Scanner scan = new Scanner(System.in);

	// METODOS CRUD
	public void adicionar() {
		// Percorrendo a lista e adicionar
		for (int i = 1; i < 4; i++) {
			System.out.println("Digite o nome do " + i + " produto");
			String produto = scan.next();
			// Adicionando itens na lista 1 por 1
			listaproduto.add(produto);
		}

	}

	public void atualizar() {
		System.out.println("Digite o numero do produto a ser atualizado");
		int numProduto = scan.nextInt();

		// Fazendo - 1 por causa do index
		numProduto = numProduto - 1;

		System.out.println("Digite o novo produto");
		String nomeProduto = scan.next();

		// Usando sett para modificar
		listaproduto.set(numProduto, nomeProduto);

	}

	public void remover() {
		System.out.println("Digite o numero do produto a ser removido");
		int numProdutoRemovido = scan.nextInt();

		// Fazendo - 1 por causa do index
		numProdutoRemovido = numProdutoRemovido - 1;

		// Removendo itens na lista
		listaproduto.remove(numProdutoRemovido);

	}

	public void listar() {
		System.out.println();
		System.out.println("Lista de produtos");
		// Exibindo itens na lista

		for (int i = 0, c = 1; i < listaproduto.size(); i++, c++) {
			System.out.println("produto " + c + " : " +listaproduto.get(i));
		}

	}
}
