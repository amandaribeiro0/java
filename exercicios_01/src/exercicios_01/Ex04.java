package exercicios_01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		//declara var's
		float n1, n2, n3, n4;
		
		// recebe valores
		System.out.println("Digite o 1º número");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o 2º número");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o 3º número");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o 4º número");
		n4 = leia.nextFloat();
		
		System.out.println("A diferença do produto é: " + ((n1 * n2) - (n3 * n4)));
		
		}
}
