package exercicio_05;

import java.util.ArrayList;
import java.util.Scanner;

public class ExCollectionList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		int i = 0;
		do {
			System.out.println("Digite uma cor:");
			cores.add(leia.nextLine());
			i++;
		} while (i < 5);

		System.out.println("\nListar todas as cores digitadas:");
		for (var eCor : cores) {
			System.out.println(eCor);
		}

		cores.sort(null);
		System.out.println("\nOrdenar as cores:");
		for (var eCor : cores) {
			System.out.println(eCor);
		}

	}
}
