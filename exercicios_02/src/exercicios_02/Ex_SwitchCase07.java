package exercicios_02;

import java.util.Scanner;

public class Ex_SwitchCase07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		double numero01, numero02;
		int operacao;

		System.out.println("Digite o primeiro número: ");
		numero01 = leia.nextDouble();
		System.out.println("Digite o segundo número: ");
		numero02 = leia.nextDouble();

		System.out.println("\nOperações matemática");
		System.out.println("1\tSoma");
		System.out.println("2\tSubtração");
		System.out.println("3\tMultiplicação");
		System.out.println("4\tDivisão");
		System.out.println("5\tPotência");
		System.out.println("6\tRaiz Quadrada");

		System.out.println("\nEscolha a operação que deseja realizar");
		operacao = leia.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("\nSoma: " + (numero01 + numero02));
			break;
		case 2:
			System.out.println("Subtração: " + (numero01 - numero02));
			break;
		case 3:
			System.out.println("Multiplicação: " + (numero01 * numero02));
			break;
		case 4:
			System.out.println("Divisão: " + (numero01 / numero02));
			break;
		case 5:
			System.out.println("Potencia: " + (Math.pow(numero01, numero02)));
			break;
		case 6:
			System.out.println("Raíz Quadrada de " + numero01 + ": " + (Math.sqrt(numero01)));
			System.out.println("Raíz Quadrada de " + numero02 + ": " + (Math.sqrt(numero02)));
			break;
		default:
			System.out.println("Operação invalida");
		}

	}

}
