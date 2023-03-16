package exercicios_02;

import java.util.Scanner;

public class Ex_If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número");
		numero = leia.nextInt();
		
		
		if (numero%2 == 0 && numero > 0) {
			System.out.print("O número " + numero + " é PAR ");
		}
		else  {
			System.out.print("O número " + numero + " é IMPAR ");
		}
		if (numero < 0) {
			System.out.println("e NEGATIVO");
		}
		else {
			System.out.println("e POSITIVO");
		}
		
	leia.close();
	}

}
