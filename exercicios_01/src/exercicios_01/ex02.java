package exercicios_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###, ##0.0");
		
		//declara var's
		float nota1, nota2, nota3, nota4;
		
		
		// recebe valores
		System.out.println("Digite a 1º nota");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a 2º nota");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a 3º nota");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a 4º nota");
		nota4 = leia.nextFloat();
		
		System.out.println("Sua média final é: " + df.format((nota1 + nota2 + nota3 + nota4)/4 ));
		}

}