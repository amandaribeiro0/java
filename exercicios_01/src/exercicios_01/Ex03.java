package exercicios_01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		//declara var's
		float salarioBruto, addNoturno, horaExtra, desconto, salarioLiq;
		
		System.out.println("Digite o valor do salario bruto");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno");
		addNoturno = leia.nextFloat();
		
		System.out.println("Digite o valor da hora extra");
		horaExtra = leia.nextFloat();
		
		System.out.println("Digite o valor do desconto");
		desconto = leia.nextFloat();
		
		//calcula salario liquido
		salarioLiq = (salarioBruto + addNoturno + (horaExtra * 5) - desconto );
		
		System.out.println("O salario liquido é de R$:" + salarioLiq);
		
		}

}
