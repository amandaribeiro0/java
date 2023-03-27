package exercicio03;

import java.time.LocalDate;

public class TestaGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate data = LocalDate.of(2020,7,20);
		Produto g1 = new Produto(1, "Joguinho da Amanda", 1, "Amanda", data, 250.0f);
		Produto g2 = new Produto(1, "Jogo da velha", 3, "Amanda", data, 50.0f);
		
		g1.visualizar();
		g2.visualizar();
		
		//testa console
		Console c1 = new Console (3, "Fifa", 2, "Amanda", data, 150.0f, "XBOX");
		c1.visualizar();
		
		//testa jogo
		Jogo j1 = new Jogo (3, "Fifa", 2, "Amanda", data, 150.0f,5);
		j1.visualizar();
	}
}
