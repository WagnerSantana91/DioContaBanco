package Banco;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		int numero;
		String agencia;
		String NomeCliente;
		double saldo;
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Agência!");
		numero = ler.nextInt();
		
		System.out.println("Por favor, digite o nome da Agência!");
		agencia = ler.next();
		
		System.out.println("Por favor, digite o seu Nome!");
		NomeCliente = ler.next();
		
		System.out.println("Por favor, digite um saldo!");
		saldo = ler.nextDouble();
		
		

		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s"
				+ ", conta %d e seu saldo %.2f já está disponível para saque", NomeCliente, agencia, numero, saldo);
		
		
		
	}
	
	
	
	

}
