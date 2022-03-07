package br.com.generation;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cli1 = new Cliente ();
		
		cli1.nome = "Adriana";
		cli1.cpf = 111111;
		cli1.idade = 22;
		cli1.sexo = 'F';
	    cli1.saldo = 1500.00;
	    cli1.valorProduto = 1400.00;
		
		
		cli1.pagamento(cli1.valorProduto);
		if (cli1.saldoRestante < 0) {
			System.out.println("Voce nao tem dinheiro suficiente.Saldo disponivel : R$" + cli1.saldo);
		}
		else {
			System.out.println("O saldo restante foi R$" + cli1.saldoRestante);
		cli1.recebe();
		}
	}
}
