package exercicios_03;

import java.util.Scanner;

public class ExWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idade, contador = 1, qtd21 = 0, qtd50 = 0;
		
		while(contador > 0) {
				System.out.println("Digite uma idade");
				idade = leia.nextInt();
				if (idade < 0) {
					contador = 0;
				}
				if (idade <= 21 && idade >=0 ) {
					qtd21++;
				}
				if (idade >= 50) {
					qtd50++;
				}
				
			}
		System.out.println("Total de pessoas menores de 21 anos: " + qtd21);
		System.out.println("Total de pessoas maiores de 50 anos: " + qtd50);
		}
	}


