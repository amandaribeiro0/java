package exercicios_04;

import java.util.Scanner;

public class Matriz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int [][] matriz = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0 ;
		String diagonalPrincipal = "", diagonalSecundaria = "";
		
		for (int iLinha = 0; iLinha < matriz.length; iLinha++) {
			for(int iColuna = 0; iColuna < matriz.length; iColuna++) {
				System.out.println("Digite um número");
				matriz[iLinha][iColuna] = leia.nextInt();
			}
		}
		
		//diagonal principal
		for (int iLinha = 0; iLinha < matriz.length; iLinha++) {
			diagonalPrincipal += matriz[iLinha][iLinha] + " ";
			somaPrincipal += matriz[iLinha][iLinha];
			
			diagonalSecundaria += matriz[iLinha][matriz.length - 1 - iLinha] + " ";
			somaSecundaria += matriz[iLinha][matriz.length - 1 - iLinha];
		}
		System.out.println("\nElementos da Diagonal Principal:\n" + diagonalPrincipal);
		System.out.println("\nSoma de todos os elementos da Diagonal Principal: " + somaPrincipal);
		System.out.println("\nElementos da Diagonal Secundária:\n" + diagonalSecundaria);
		System.out.println("\nSoma de todos os elementos da Diagonal Secundária: " + somaSecundaria);
	}

}
