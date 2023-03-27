package exercicio02;

import java.time.LocalDate;

public class Vendedor extends Funcionario{
	
	private float comissao;

	public Vendedor(int id, String nome, float salario, String cargo, String cpf, LocalDate dataAdmissao,
			float comissao) {
		super(id, nome, salario, cargo, cpf, dataAdmissao);
		this.comissao = comissao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Comissão: " + this.comissao);
	}
}
