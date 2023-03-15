package exercicios_01;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		float salario, abono;
		
		System.out.println("Digite o salario atual: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();	
		
		System.out.println("Seu novo salario é R$:" + (salario + abono));
	
		leia.close();
	}

}
