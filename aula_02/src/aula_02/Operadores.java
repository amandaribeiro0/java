package aula_02;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 2, n2 = 2;
		
		// operadores de incremento
		/* 
		 Quando escrevemos o operador ++ ou -- antes de uma variável, isso é chamado de pré-incremento 
		 e pré-decremento respectivamente. Nestes casos, o incremento ou decremento é feito primeiro e 
		 depois o novo valor incrementado ou decrementado é retornado.


		Quando escrevemos o operador ++ ou -- após uma variável, ele é chamado de pós-incremento e 
		pós-decremento respectivamente. Nestes casos, o operador primeiro retorna o valor do operando e, a
		o final, é feito um incremento ou decremento.

		 */
		// Pré Incremento
		System.out.println("Varriavel N1: " + n1);
		System.out.println("Varriavel N1: " + (++ n1));

		//Pós Incremento
		System.out.println("Variavel N2: " + n2);
		System.out.println("Variavel N2: " + (n2++));
		System.out.println("Variavel N2: " + n2);

		
		// Operadores de Atribuição
		System.out.println("Variavel N2: " + (n2 += 3));
		
	}

}
