package metodoMain;

import java.util.Scanner;

import modelo.DadosUsuarios;

public class ContaTerminal {

	public static void main(String[] args) {
		
		DadosUsuarios cliente= new DadosUsuarios();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Informe o nome do cliente");
		String nomeCliente= scanner.next();
		
		System.out.println("Informe agencia");
		int agencia= scanner.nextInt();
		
		System.out.println("Informe conta");
		int conta= scanner.nextInt();
		
		System.out.println("Informe valor do deposito");
		double saldo= scanner.nextInt();
		
		cliente.abrirConta(nomeCliente, agencia, conta, saldo);
		
System.out.println("----------------------------------");
		
		System.out.println("Nome cliente: "+cliente.cliente);
		System.out.println("Agencia: " + cliente.agencia);
		System.out.println("Conta: " + cliente.conta);
		System.out.println("Saldo liberado para saque: R$" + cliente.saldo);
		

	}

}
