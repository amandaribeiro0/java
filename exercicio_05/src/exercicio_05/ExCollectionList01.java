package exercicio_05;

import java.util.ArrayList;
import java.util.Scanner;

public class ExCollectionList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		char resp = 'S';

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		for (int i : vetorInteiros) {
			numeros.add(i);
		}

		do {
			System.out.println("Deseja procurar um número?");
			resp = leia.next().toUpperCase().charAt(0);
			
			if (resp == 'S') {
				System.out.println("Digite um número:");
				var n = leia.nextInt();
	
				if (numeros.contains(n)) {
					System.out.println("O número" + n + "está na posição: " + numeros.indexOf(n));
				} else {
					System.out.println("O número" + n + "não foi encontrado");
				}
			}else {
				System.exit(0);
			}
			
		} while (resp == 'S');

	}
}
