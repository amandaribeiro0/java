package exercicio_05;

import java.util.Scanner;
import java.util.Stack;

public class ExStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		int opcao = 0;
		String nome;

		do {
			System.out.println("\n1 - Cadastrar novo livro.");
			System.out.println("2 - Listar todos os livros. ");
			System.out.println("3 - Retirar um livro da pilha ");
			System.out.println("0 - Encerrar");

			System.out.println("\nEscolha uma opção: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar novo livro.");
				System.out.println("Digite o nome:");
				leia.nextLine();
				nome = leia.nextLine();
				pilha.push(nome);
				break;
			case 2:
				System.out.println("\nListar todas os livros:");
				if (pilha.isEmpty()) {
					System.out.println("Não existem livros na pilha.\n");
				} else {
					for (var ePilha : pilha) {
						System.out.println(ePilha);
					}
				}
				break;
			case 3:
				System.out.println("Retirar um livro na pilha.");
				pilha.pop();

				break;
			default:
				if (opcao > 3)
					System.out.println("Opção escolhida é invalida");
			}
		} while (opcao != 0);
		leia.close();
	}

}
