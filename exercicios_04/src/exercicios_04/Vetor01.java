package exercicios_04;

import java.util.Scanner;

public class Vetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		for (int contador = 0; contador < vetorInteiros.length; contador++) {
					if (vetorInteiros[contador] == numero) {
						System.out.println("O número " + numero + " está localizado na posição: " + contador);
						System.exit(0);
					}
		}
		for (int contador = 0; contador < vetorInteiros.length; contador++) {
					if (numero != vetorInteiros[contador]) {
						System.out.println("Número "+ numero + " não foi encontrado");
						System.exit(0);
					}	
		}
		
	}
}
