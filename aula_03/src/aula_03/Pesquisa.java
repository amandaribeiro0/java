package aula_03;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade, sexo, esporte, contador = 0, futebolFeminino = 0, maiores18Volei = 0;
		char continua = 'S';

		while (continua == 'S') {
			System.out.println("Digite a sua idade:");
			idade = leia.nextInt();
			
			do {
			System.out.println("Digite o sexo (\n1 - M \n2 - F \n3 - Outros)");
			sexo = leia.nextInt();
			}while(sexo<1 || sexo >3);
				
			System.out.println("Digite o seu Esporte Favorito (\n1 - Futebol \n2 - Volei \n3 - Basquete");
			esporte = leia.nextInt();
			
			contador ++;
			if(sexo == 2 && esporte == 1) {
				futebolFeminino++;
			}
			if(idade >= 18 && esporte == 2) {
				maiores18Volei++;
			}
			System.out.println("Deseja continuar?");
			continua = leia.next().toUpperCase().charAt(0);
		}
		System.out.println(futebolFeminino + " pessoas do sexo feminino gostam de futebol");
		System.out.println(maiores18Volei + " pessoas maiores de 18 anos gostam de volei");
		System.out.println("Foram preenchidas " + contador + " fichas");
	}
}
