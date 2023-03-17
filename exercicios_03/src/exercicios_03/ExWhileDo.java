package exercicios_03;

import java.util.Scanner;

public class ExWhileDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int numero, soma = 0;
		
		do {
			System.out.println("Digite um número (Digite 0 para sair)");
			numero = leia.nextInt();
			if (numero > 0) {
				soma += numero;
			}
		}
		while (numero != 0);
			

		
		System.out.println("A soma dos números positivos é: " + soma);
	}

}
