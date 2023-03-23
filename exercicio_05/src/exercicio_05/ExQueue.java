package exercicio_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcao = 0;
		String nome;

		do {
			System.out.println("\n1 - Cadastrar nova pessoa na fila.");
			System.out.println("2 - Listar todas as pessoas da fila");
			System.out.println("3 - Chamar (retirar) uma pessoa da fila ");
			System.out.println("0 - Encerrar");

			System.out.println("\nEscolha uma opção: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar nova pessoa na fila");
				System.out.println("Digite um nome:");
				leia.nextLine();
				nome = leia.nextLine();
				fila.add(nome);
				break;
			case 2:
				System.out.println("\nListar todas as pessoas:");
				if (fila.isEmpty()) {
					System.out.println("Não existem pessoas na fila.\n");
				} else {
					for (var eFila : fila) {
						System.out.println(eFila);
					}
				}
				break;
			case 3:
				System.out.println("Retirar uma pessoa da fila.");
				fila.poll();

				break;
			default:
				if (opcao > 3)
					System.out.println("Opção escolhida é invalida");
			}
		} while (opcao != 0);
		leia.close();
	}

}
