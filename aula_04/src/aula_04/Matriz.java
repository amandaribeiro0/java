package aula_04;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		// declara matriz
		int[][] matrizInteiros = {{10, 15, 35}, {70, 120, 140}, {50, 100, 150}};
		float matrizFloat [][] = new float [2][3];
		
		// print matriz inteiros
		System.out.println("Matriz Inteiros:");
		for(int iLinha = 0; iLinha < matrizInteiros.length; iLinha++) {
			for (int iColuna = 0; iColuna < matrizInteiros.length; iColuna++) {
				System.out.println(matrizInteiros[iLinha][iColuna]);
			}
		}
		
		// insere dados na matriz float
		for(int iLinha = 0; iLinha < matrizFloat.length; iLinha++) {
			for (int iColuna = 0; iColuna < matrizFloat[iLinha].length; iColuna++) {
				System.out.println("\nDigite um número");
				matrizFloat[iLinha][iColuna] = leia.nextFloat();
			}
		}
		
		//mostra dados matriz float
		System.out.println("\nMatriz Float");
		for(int iLinha = 0; iLinha < matrizFloat.length; iLinha++) {
			for (int iColuna = 0; iColuna < matrizFloat[iLinha].length; iColuna++) {
				System.out.println(matrizFloat[iLinha][iColuna]);
			}
		}
		
		
	}
}
