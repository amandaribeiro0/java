package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		ArrayList<Double> notas = new ArrayList<Double>();

		int opcao = 0;
		double nota = 0.0;

		do {
			System.out.println("1 - Cadastrar nota");
			System.out.println("2 - Listar todas as notas");
			System.out.println("3 - Buscar uma notas");
			System.out.println("4 - Remover uma nota");
			System.out.println("5 - Atualizar uma nota");
			System.out.println("6 - Sair");

			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar nota.");
				System.out.println("Digite uma nota:");
				notas.add(leia.nextDouble());
		
				break;
			case 2:
				System.out.println("Listar todas as notas.");
				if (notas.isEmpty()) {
					System.out.println("Não existem notas cadastradas.\n");
				}else {
				for (var eNota: notas) {
					System.out.println(eNota);
				}}
				break;
			case 3:
				System.out.println("Buscar uma notas.");
				System.out.println("Digite uma nota: ");
				nota = leia.nextDouble();
				
				if(notas.contains(nota)) {
					System.out.println("A nota está localizada na posição: " + notas.indexOf(nota));
				}else {
					System.out.println("A nota não foi encontrada!");
				}
				
				break;
			case 4:
				System.out.println("Remover uma nota.");
				System.out.println("Digite uma nota:");
				nota = leia.nextDouble();
				notas.remove(nota);
				break;
			case 5:
				System.out.println("Atualizar uma nota.");
				System.out.println("Digite a nota que deseja atualizar:");
				nota = leia.nextDouble();
				System.out.println("Digite a nova nota: ");
				var newNota = leia.nextDouble();
				notas.set(notas.indexOf(nota), newNota);
				break;
			default:
				if (opcao > 6)
					System.out.println("Opção escolhida é invalida");
			}
		} while (opcao != 6);
		leia.close();
	}

}
