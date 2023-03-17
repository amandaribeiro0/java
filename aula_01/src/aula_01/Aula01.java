package aula_01;
// Importando libs
import java.text.DecimalFormat;
import java.util.Scanner;


public class Aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criando mascara para formatar saida de dados com , ao inves de .
		DecimalFormat df = new DecimalFormat("###,###, ##0.00");
		
		// Scanner : formatação para ler os dados via teclado
		Scanner leia = new Scanner(System.in);
		
		//Declara Var
		double numero01, numero02;
		String nome;
		
		// Pede para usuario inserir os dados e recebe eles
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();		
		
		System.out.println("Digite o primeiro número: ");
		numero01 = leia.nextDouble();
		
		// nextLine metodo para ler string da Class scanner
		System.out.println("Digite o segundo número: ");
		numero02 = leia.nextDouble();
		
		
		// df.format : importa a mascara feita na primeira linha
		System.out.println("Nome: " + nome);
		System.out.println("\nSoma: " + df.format(numero01 + numero02));
		System.out.println("Subtração: " + df.format(numero01 - numero02));
		System.out.println("Multiplicação: " + df.format(numero01 * numero02));
		System.out.println("Divisão: " + df.format(numero01 / numero02));
		System.out.println("Potencia: " + df.format(Math.pow(numero01 ,numero02)));
		System.out.println("Raíz Quadrada de " + numero01 + ": " + df.format(Math.sqrt(numero01)));
		System.out.println("Raíz Quadrada de " + numero02 + ": " + df.format(Math.sqrt(numero02)));

		// Chama o leia para sumir o warning
		leia.close();
	}

}
 