package aula_03;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		// delcara variaveis
		int numero;

		// mostra no console
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		// laço de repetição
		for(int contador = 1; contador <= 10; contador++) {
			System.out.println(numero + " x " + contador + " = " + (numero*contador));
		}
	}
}
