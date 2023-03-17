package exercicios_02;

import java.util.Scanner;

public class Ex_SwitchCase06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int codigo, quantidade;

		System.out.println("\n\t\tProduto \t Preço   ");
		System.out.println("1\t Cachorro quente\t R$10,00");
		System.out.println("2\t X-Salada\t\t R$15,00");
		System.out.println("3\t X-Bacon\t\t R$18,00");
		System.out.println("4\t Bauru\t\t\t R$12,00");
		System.out.println("5\t Refrigerante\t\t R$8,00");
		System.out.println("6\t Suco de laranja\t R$13,00");

		System.out.println("\nQual produto deseja?");
		codigo = leia.nextInt();

		System.out.println("Digite a quantidade desejada: ");
		
		quantidade = leia.nextInt();

		switch (codigo) {
		case 1:
			System.out.println(
					"Seu pedido foi: " + quantidade + " cachorro quente. No valor total de R$:" + (quantidade * 10.00));
			break;
		case 2:
			System.out.println(
					"Seu pedido foi: " + quantidade + " x-salada. No valor total de R$:" + (quantidade * 15.00));
			break;
		case 3:
			System.out.println(
					"Seu pedido foi: " + quantidade + " x-bacon. No valor total de R$:" + (quantidade * 18.00));
			break;
		case 4:
			System.out
					.println("Seu pedido foi: " + quantidade + " bauru. No valor total de R$:" + (quantidade * 12.00));
			break;
		case 5:
			System.out.println(
					"Seu pedido foi: " + quantidade + " refrigerante. No valor total de R$:" + (quantidade * 8.00));
			break;
		case 6:
			System.out.println(
					"Seu pedido foi: " + quantidade + " suco de laranja. No valor total de R$:" + (quantidade * 13.00));
			break;
			
		default:
			System.out.println("Produto invalido");
		}
	}

}
