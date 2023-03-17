package exercicios_03;

import java.util.Scanner;

public class ExFor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int n1,n2, contador = 0;
		
		System.out.println("Digite um número:");
		n1 = leia.nextInt();
		
		System.out.println("Digite um número maior que o anterior:");
		n2 = leia.nextInt();
		
		if (n1 > n2) {
			System.out.println("Intervalo inválido!");
		}else {
			for (contador = n1; contador <= n2; contador ++) {
				if (contador%3 == 0 && contador%5 == 0) {
					System.out.println(contador + " é multiplo de 5 e 3");
				}
			
			}
		} System.out.println("Programa encerrado.");
	}

}
