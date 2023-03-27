package exercicio02;

import java.time.LocalDate;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate data1 = LocalDate.of(2020,7,20);
		LocalDate data2 = LocalDate.of(2015,11,17);
		Funcionario f1 = new Funcionario(1, "Amanda Ribeiro", 5000.0f, "CEO", "567432780-56", data1);
		Funcionario f2 = new Funcionario(2, "Amanda Costa", 1500.0f, "Desenvolvedora", "543123905-20", data2);
		
		f1.visualizar();
		f2.visualizar();
		
		//Testa gerente
		Gerente g1 = new Gerente (3, "Amanda", 1500.0f, "Desenvolvedora", "545623905-20", data2,"Gerente");
		g1.visualizar();
		
		//Testa vendedor
		Vendedor v1 = new Vendedor (3, "Amandinha", 1200.0f, "Vendedora", "545623905-20", data2,500.0f);
		v1.visualizar();
	}

}
