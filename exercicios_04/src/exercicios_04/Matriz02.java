package exercicios_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Matriz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.0");
		float matrizNotas[][] = new float[10][4];
		float[] vetorMedias = new float[10];
		float soma, media;

		for (int iLinha = 0; iLinha < matrizNotas.length; iLinha++) {
			System.out.println("\nAluno: " + (iLinha + 1));
			for (int iColuna = 0; iColuna < matrizNotas[iLinha].length; iColuna++) {
				System.out.println("Digite a " + (iColuna + 1) + "º nota:");
				matrizNotas[iLinha][iColuna] = leia.nextFloat();
			}
		}
		for (int iLinha = 0; iLinha < matrizNotas.length; iLinha++) {
			soma = 0;
			media = 0;
			for (int iColuna = 0; iColuna < matrizNotas[iLinha].length; iColuna++) {
				soma += matrizNotas[iLinha][iColuna];
			}
			media = soma / 4;
			vetorMedias[iLinha] = media;
		}
		System.out.println("\nMédias:");
		for (float vMedia : vetorMedias) {
			System.out.println(df.format(vMedia));
		}
	}
}
