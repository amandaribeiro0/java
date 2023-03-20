package aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int vetorInteiros[] = { 4, 5, 7, 6, 10, 1, 3, 2, 9, 8 };
		float[] vetorFloat = new float[5];
		int numero;
		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		for (int contador = 0; contador < vetorInteiros.length; contador++) {
			if (vetorInteiros[contador] == numero)
				System.out.println("Posição [" + contador + "] = " + vetorInteiros[contador]);
		}

		for (int contador = 0; contador < vetorFloat.length; contador++) {
			System.out.println("Digite um valor para a posição [" + contador + "]: ");
			vetorFloat[contador] = leia.nextFloat();
		}
		
		System.out.println("\nVetor Float:");
		for ( float vfloat : vetorFloat) {
			System.out.println(vfloat);
		}
		
		System.out.println("\nVetor Inteiro:");
		Arrays.sort(vetorInteiros);
		for ( float vInt : vetorInteiros) {
			System.out.println(vInt);
		}
	}
}
