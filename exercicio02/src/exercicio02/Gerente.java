package exercicio02;

import java.time.LocalDate;

public class Gerente extends Funcionario {
	private String funcao;

	public Gerente(int id, String nome, float salario, String cargo, String cpf, LocalDate dataAdmissao,
			String funcao) {
		super(id, nome, salario, cargo, cpf, dataAdmissao);
		this.funcao = funcao;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Função: " + this.funcao);
	}
}
