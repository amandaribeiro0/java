package exercicios_02;

import java.util.Scanner;

public class Ex_If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		// Var's
		int a, b, c, soma;
		
		System.out.println("Digite o primeiro número: ");
		a = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		b = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		c = leia.nextInt();
		
		soma = a + b;
		
		if(soma > c) {
		System.out.println( a + " + " + b + " = " + soma + " > " + c);
		System.out.println("\nSoma de A + B é MAIOR que C");
		}
		else if (soma < c) {
			System.out.println( a + " + " + b + " = " + soma + " < " + c);
			System.out.println("Soma de A + B é MENOR que C");
		}
		else if (soma == soma) {
			System.out.println( a + " + " + b + " = " + soma + " = " + c);
			System.out.println("Soma de A + B é IGUAL a C");
		}
		
		leia.close();
	}
}
